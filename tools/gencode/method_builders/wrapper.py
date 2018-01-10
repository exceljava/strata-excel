from .base import MethodBuilderBase
from ..javalang import parse_method_of_class
from itertools import chain


class WrapperMethodBuilder(MethodBuilderBase):
    """
    Some methods need specific wrappers hand coded in
    the yaml :(
    """

    def __init__(self, cls, method, xlname, wrapper, imports=[]):
        super().__init__(cls, method, xlname)
        self.wrapper = wrapper
        self.imports.update(imports)
        self.__method_str = None

    def __str__(self):
        return self.__method_str

    def build(self, all_classes):
        self.imports.update({
            "com.exceljava.jinx.ExcelFunction",
            "com.exceljava.jinx.ExcelArguments",
            "com.exceljava.jinx.ExcelArgument"
        })

        # add a public modifier and indent the wrapper method
        wrapper = self.wrapper
        if not wrapper.startswith("public"):
            wrapper = "public " + wrapper
        wrapper = "    " + "\n    ".join(wrapper.splitlines())

        # parse the wrapper method as if it belongs to the Strata class
        method = parse_method_of_class(self.cls, wrapper)

        self.imports.update(self.cls.imports)
        self.imports.update(method.return_type.imports)
        self.imports.update(chain(*(t.imports for n, t in method.parameters)))

        for ptype in [t for n, t in method.parameters] + [method.return_type]:
            if ptype.package and ptype.package.startswith("com.opengamma.strata"):
                if str(ptype) not in all_classes:
                    raise Exception(f"Class '{ptype}' hasn't been loaded (used by {self.cls.name}).")

        params, pnames, transforms = self.prepare_parameters(method.parameters)
        if transforms:
            raise Exception(f"Wrapper code '{self.cls.name}.{method.name}' can't have transforms applied to it")

        params = ", ".join(params)
        pnames = ", ".join(pnames)

        annotations = [f'@ExcelArgument("{n}")' for n, t in method.parameters]
        annotations = ",\n".join(("        " + x for x in annotations))

        method_str = f"""
    @ExcelFunction(
        value = "{self.xlname}",
        category = "{self.category}",
        isThreadSafe = true
    )
    @ExcelArguments({{
{annotations}
    }})
{wrapper}
"""

        self.__method_str = method_str
        return self
