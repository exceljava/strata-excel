from .base import MethodBuilderBase
from collections import OrderedDict
from itertools import chain


class BuilderMethodBuilder(MethodBuilderBase):
    """
    Many of Strata's immutable classes are joda beans
    constructed using a builder method.

    This method builder constructs Excel wrapper methods
    for those builder methods.
    """

    def __init__(self, cls, method, xlname):
        super().__init__(cls, method, xlname)
        assert method.is_static, "Builder methods must be static"
        self.__method_str = None

    def __str__(self):
        return self.__method_str

    def build(self, all_classes):
        builder_cls = all_classes.get(str(self.method.return_type))
        if not builder_cls:
            raise Exception(f"Builder class {self.method.return_type} not found.")

        build = builder_cls.methods.get("build")
        build = build[0] if len(build) == 1 else None
        if not build:
            raise Exception(f"Builder class {self.method.return_type} "
                            "expected to have exactly one build method.")

        return_type = build.return_type
        if str(return_type) != str(self.cls.type):
            raise Exception(f"Builder class {self.method.return_type}'s "
                            "build method does not return {self.cls.type}.")

        # Find the various set methods on the builder.
        # Any set methods taking a collection are translated into
        # optional parameters to the excel function.
        builder_fragments = OrderedDict()
        collection_parameters = OrderedDict()  # {name -> type}
        for name, methods in builder_cls.methods.items():
            for method in methods:
                if method.return_type.name == builder_cls.name \
                        and len(method.parameters) == 1:
                    pname, ptype = method.parameters[0]
                    self.imports.update(ptype.imports)
                    if ptype.package and ptype.package.startswith("com.opengamma.strata"):
                        if str(ptype) not in all_classes:
                            raise Exception(f"Class '{ptype}' hasn't been loaded (used by {self.cls.signature}).")

                    # collections are passed as parameters and the specific collection type
                    # needs to be constructed
                    if ptype.name in {"List", "Collection", "Set", "Iterable"}:
                        collection_parameters[pname] = ptype.arguments[0]
                        to_collection, imports = self.to_collection(ptype, pname)
                        self.imports.update(imports)
                        builder_fragments[pname] = f"""
        if (null != {pname}) {{
            {ptype.signature} value = {to_collection};
            builder = builder.{method.name}(value);
        }}
        """
                    else:
                        # add the option value to the builder if it hasn't already
                        # been added (collection arguments take precedence)
                        if ptype.is_primitive:
                            ptype = ptype.boxed_type
                        builder_fragments.setdefault(pname, f"""
        Object {pname} = args.get("{pname.lower()}");
        if (null != {pname}) {{
            {ptype.signature} value;
            try {{
                value = xl.convertArgument({pname}, {ptype.signature}.class);
            }} catch (Exception e) {{
                throw new IllegalArgumentException("{pname} could not be converted to {ptype.signature}", e);
            }}
            builder = builder.{method.name}(value);
            usedArgs.add("{pname.lower()}");
        }}
        """)

        self.imports.update({
            "com.exceljava.jinx.ExcelFunction",
            "com.exceljava.jinx.ExcelArgument",
            "com.exceljava.jinx.ExcelArguments",
            "static java.util.stream.Collectors.toMap",
            "java.util.HashSet",
            "java.util.Map",
            "java.util.Set",
            "java.util.stream.IntStream"
        })

        self.imports.update(self.method.return_type.imports)
        self.imports.update(chain(*(t.imports for n, t in self.method.parameters)))

        extra_params = ""
        if collection_parameters:
            extra_params += ", " + ", ".join(
                (f"{t.signature}[] {n}" for n, t in collection_parameters.items()))

        method_str = f"""
    @ExcelFunction(
        value = "{self.xlname}",
        category = "{self.category}",
        isThreadSafe = true
    )
    @ExcelArguments({{
        @ExcelArgument("keys"),
        @ExcelArgument("values")
    }})
    public {return_type.signature} {self.method.name}(String[] keys, Object[] values{extra_params}) {{
        if (keys.length != values.length) {{
            throw new IllegalArgumentException("Keys and values must be the same length");
        }}

        Map<String, Object> args = IntStream
                .range(0, keys.length)
                .boxed()
                .filter(i -> values[i] != null)
                .collect(toMap(i -> keys[i].toLowerCase(), i -> values[i]));

        Set<String> usedArgs = new HashSet<String>();
        {builder_cls.signature} builder = {self.cls.signature}.{self.method.name}();
        """

        for fragment in builder_fragments.values():
            method_str += fragment

        method_str += f"""
        return builder.build();
    }}
        """

        self.__method_str = method_str
        return self
