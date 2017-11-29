"""
Builds the Excel wrapper classes from a Strata class.
"""
from .method_builders import get_method_builder, ArgConverterBuilder


def get_wrapper_class_name(class_name):
    """Gets the default wrapper class name for a Strata class name."""
    components = class_name.split(".")
    if tuple(components[:3]) != ("com", "opengamma", "strata"):
        raise Exception(f"{class_name} doesn't look like a Strata class")
    return "com.jinx.strataexcel." + ".".join(components[3:]) + "XL";


def _get_excel_function_name(cls, method_name):
    """return an Excel function name for a method"""
    return f"og.{cls.name}.{method_name}"


def _get_method_builder(cls, xlname, method=None, type=None, signature=None, **kwargs):
    """Returns a MethodBuilder instance for a class method.

    If the method name and type are not specified this function will try
    to determine sensible defaults.

    Signature can be used to select a specific method when overloads exist.
    """
    # builder methods are called 'build' in Excel but usually map to the 'builder'
    # method in Strata
    if not method:
        if xlname == "build" and not cls.methods.get("build") and cls.methods.get("builder"):
            method = "builder"

    method_name = method or xlname
    xlfunc = _get_excel_function_name(cls, xlname)

    # if the wrapper code is given then don't try and find the method on the class
    if type == "wrapper" or "wrapper" in kwargs:
        method_builder = get_method_builder("wrapper", cls, None, xlfunc, **kwargs)
        return method_builder

    methods = cls.methods.get(method_name)
    if not methods:
        raise Exception(f"{cls.name} has no method '{method_name}'")

    if len(methods) > 1:
        if not signature:
            raise Exception(f"{cls.name} has multiple '{method_name}' methods")
        for method in methods:
            if method.signature == signature:
                break
    else:
        method = next(iter(methods))

    if signature and signature != method.signature:
        raise Exception(f"{cls.name}.{method_name} with signature '{signature}' "
                        "not found")

    # if no method_type is specified try and infer what it should be from the
    # method type and name
    if not type:
        if method.is_static:
            if method_name == "builder":
                type = "builder"
            elif xlname in {"of", "parse"} and len(method.parameters) == 1:
                type = "arg_converter"
            else:
                type = "static"
        else:
            type = "method"

    method_builder = get_method_builder(type, cls, method, xlfunc, **kwargs)
    return method_builder


def build_wrapper_class(wrapper_class_name, strata_class, config, all_classes):
    """
    :param wrapper_class_name: Name of wrapper class to create.
    :param strata_class: JavaClass of the Strata class to be wrapped.
    :param config: Config parsed from the yaml config (dict of classes to method info)
    :param all_classes: dictionary of class names to JavaClass objects.
    """
    # build all the methods first and get the imports needed
    imports = {
        "com.jinx.ExcelAddIn"
    }

    # class methods in the config can be a list of class names, or a dictionary
    # of methods to options, or a list of dictionaries of methods to options
    # The following flattens into a list of {method: options} dicts
    methods = config.get(str(strata_class.type)) or []
    if isinstance(methods, dict):
        methods = [methods]

    methods_and_options = []
    methods_to_process = list(methods)
    while methods_to_process:
        method = methods_to_process.pop(0)
        if isinstance(method, list):
            methods_to_process.extend((method, {}))

        elif isinstance(method, str):
            methods_and_options.append((method, {}))

        elif isinstance(method, dict):
            if len(method) == 1:
                methods_and_options.append(next(iter(method.items())))
            else:
                methods_to_process.extend(({k: v} for k, v in method.items()))

        else:
            raise Exception(f"Unexpected item in config: {method}")

    # construct the builders for each of the exposed methods
    method_builders = {}
    for xlname, options in methods_and_options:
        builder = _get_method_builder(strata_class,
                                      xlname,
                                      **options)

        builder = builder.build(all_classes)
        imports.update(builder.imports)
        method_builders[builder.xlname] = builder

    # add methods for accessing all public fields
    for field in strata_class.fields:
        if field.is_public:
            xlname = _get_excel_function_name(strata_class, field.name)
            builder = get_method_builder("field", strata_class, field, xlname)
            builder = builder.build(all_classes)
            imports.update(builder.imports)
            method_builders[builder.xlname] = builder

    # if there's no argument converter and there are public static fields then an argument
    # converter to get a standar instance from a field name
    is_cls_field = lambda x: x.is_public and x.is_static and str(x.type) == str(strata_class.type)
    if (not any(isinstance(x, ArgConverterBuilder) for x in method_builders.values())) \
    and any(is_cls_field(f) for f in strata_class.fields):
        xlname = _get_excel_function_name(strata_class, "get")
        builder = get_method_builder("field_converter", strata_class, None, xlname)
        builder = builder.build(all_classes)
        imports.update(builder.imports)
        method_builders[builder.xlname] = builder

    # add the toString method if there is one
    to_string = _get_excel_function_name(strata_class, "toString")
    if to_string not in method_builders and "toString" in strata_class.methods:
        builder = _get_method_builder(strata_class,
                                      xlname="toString",
                                      type="method",
                                      signature="String toString()")

        builder = builder.build(all_classes)
        imports.update(builder.imports)
        method_builders[builder.xlname] = builder

    package, class_name = wrapper_class_name.rsplit(".", 1)

    class_str = f"""
/*
 * THIS FILE IS AUTO-GENERATED
 *
 * Copyright (C) 2017 - present by Tony Roberts.
 *
 * Please see distribution for license.
 *
 */
package {package};

""".lstrip()

    for x in sorted(imports):
        class_str += f"import {x};\n"

    class_str += f"""    

public class {class_name} {{
    private final ExcelAddIn xl;

    public {class_name}(ExcelAddIn xl) {{
        this.xl = xl;
    }}
    """

    for xlname, method_builder in sorted(method_builders.items()):
        class_str += str(method_builder)

    class_str = class_str.rstrip() + """
}
"""

    return class_str
