"""
Code for fetching meta-data about java classes using javalang
"""
from .types import JavaType, JavaClass, JavaMethod, JavaField
import javalang
import os


__all__ = [
    "get_class_info",
    "JavaType",
    "JavaClass",
    "JavaMethod"
]


def _filter_tree(tree, pattern):
    for path, node in tree:
        if isinstance(node, pattern):
            yield path, node


def _find_source_file(source_root, classname):
    """looks for a Strata source file from a class name"""
    components = classname.split(".")
    if len(components) < 4 or tuple(components[0:3]) != ("com", "opengamma", "strata"):
        raise Exception("Class %s is not from Strata" % classname)

    module = components[3]
    path = [source_root, "modules", module, "src", "main", "java"]
    path.extend(components[:-1])
    path.append(components[-1] + ".java")
    path = os.path.join(*path)

    if not os.path.exists(path):
        raise Exception("Class source '%s' not found for %s" % (path, classname))

    return path


def get_class_info(source_root, classname):
    """
    Parses the source file for a class and returns information
    about any classes declared in that class file (including
    any public inner classes)

    Returns a dictionary of {fully qualified class name: JavaClass}.
    """
    path = _find_source_file(source_root, classname)
    with open(path, "rt") as fh:
        return _get_class_info(path, fh.read())


def _get_class_info(source_path, class_text):
    """
    Implementation of get_class_info that takes the source
    file as a string.
    """
    tree = javalang.parse.parse(class_text)

    package = ""
    for path, node in _filter_tree(tree, javalang.tree.PackageDeclaration):
        package = node.name
        break

    imports = {}
    for path, node in _filter_tree(tree, javalang.tree.Import):
        if not node.wildcard:
            pkg, cls = node.path.rsplit(".", 1)
            imports[cls] = pkg

    standard_types = {
        "Object",
        "Iterable",
        "String",
        "Double",
        "Float",
        "Integer",
        "Long",
        "Short",
        "Char",
        "Byte"
    }

    def _get_type(t, outer_class=None):
        if t is None:
            return JavaType("void")

        arguments = getattr(t, "arguments", None)
        if arguments:
            arguments = [_get_type(x.type) for x in arguments]

        dimensions = getattr(t, "dimensions", None)

        if t.name in standard_types or isinstance(t, javalang.tree.BasicType):
            return JavaType(t.name, arguments=arguments, dimensions=dimensions)

        name = t.name
        sub_type = getattr(t, "sub_type", None)
        while sub_type:
            name += "." + sub_type.name
            sub_type = getattr(sub_type, "sub_type", None)

        pkg = None
        if outer_class and outer_class != name:
            if outer_class.split(".")[-1] == name:
                outer_class = ".".join(outer_class.split(".")[:-1])
            pkg = imports.get(outer_class + "." + name)
            if pkg:
                name = outer_class + "." + name

        pkg = pkg or imports.get(name)
        if pkg is None:
            pkg = package  # if it wasn't in the imports it must be in the same package

        return JavaType(name, pkg, arguments=arguments, dimensions=dimensions)

    prev_depth = -1
    class_name_stack = []
    class_nodes = {}

    class_like = (
        javalang.tree.ClassDeclaration,
        javalang.tree.EnumDeclaration,
        javalang.tree.InterfaceDeclaration)

    for path, node in _filter_tree(tree, class_like):
        if "public" not in node.modifiers:
            continue

        depth = len([x for x in path if isinstance(x, class_like)])
        if depth <= prev_depth:
            class_name_stack = class_name_stack[:-1]
        prev_depth = depth

        name = (".".join(class_name_stack) + "." if class_name_stack else "") + node.name
        imports[name] = package
        class_name_stack.append(node.name)
        class_nodes[name] = node

    classes = {}
    for name, node in class_nodes.items():
        methods = []
        for method_node in node.methods:
            if "public" not in method_node.modifiers:
                continue
            return_type = _get_type(method_node.return_type, name)
            parameters = [(x.name, _get_type(x.type, name)) for x in method_node.parameters]
            method = JavaMethod(method_node.name, method_node.modifiers, parameters, return_type)
            methods.append(method)

        fields = []
        for field_node in node.fields:
            if "public" not in field_node.modifiers:
                continue
            type = _get_type(field_node.type, name)
            field_name = field_node.declarators[0].name
            field = JavaField(field_name, type, field_node.modifiers)
            fields.append(field)

        # find the first declaration so we know where we can inject wrapper code later
        pos = -1
        for unused, decl in node.filter(javalang.tree.Declaration):
            if decl is not node and decl.position:
                pos = min(x.position[0] for p, x in decl if x.position)
                break

        cls = JavaClass(source_path, pos, name, package, methods, fields)

        classes[str(cls.type)] = cls

    return classes


def parse_method_of_class(cls, method_text):
    """
    Parses a method as if it belongs to a class and returns
    the new method.
    """
    source_lines = []
    with open(cls.source_path, "rt") as fh:
        source_lines.extend(fh.readlines())

    source_lines.insert(cls.decls_start_line-1, method_text)

    classes = _get_class_info(cls.source_path, "".join(source_lines))

    # the method added is always the first one
    return next(iter(classes[str(cls.type)].methods.values()))[0]
