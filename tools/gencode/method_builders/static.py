from .base import MethodBuilderBase
from itertools import chain


class StaticMethodBuilder(MethodBuilderBase):
    """
    Builder for static method wrappers
    """

    def __init__(self, cls, method, xlname):
        super().__init__(cls, method, xlname)
        if not method.is_static:
            raise RuntimeError(f"{cls.name}.{method} is not static")
        self._method_str = None

    def __str__(self):
        return self._method_str

    def build(self, all_classes):
        self.imports.update({
            "com.exceljava.jinx.ExcelFunction",
            "com.exceljava.jinx.ExcelArguments",
            "com.exceljava.jinx.ExcelArgument"
        })

        self.imports.update(self.method.return_type.imports)
        self.imports.update(chain(*(t.imports for n, t in self.method.parameters)))

        for ptype in [t for n, t in self.method.parameters] + [self.method.return_type]:
            if ptype.package and ptype.package.startswith("com.opengamma.strata"):
                if str(ptype) not in all_classes:
                    raise Exception(f"Class '{ptype}' hasn't been loaded (used by {self.cls.name}).")

        method_str = f"""
    @ExcelFunction(
        value = "{self.xlname}",
        category = "{self.category}",
        isThreadSafe = true
    )"""

        if self.method.parameters:
            annotations = [f'@ExcelArgument("{n}")' for n, t in self.method.parameters]
            annotations = ",\n".join(("        " + x for x in annotations))
            method_str += f"""
    @ExcelArguments({{
{annotations}
    }})"""

        params, pnames, transforms = self.prepare_parameters(self.method.parameters)
        params = ", ".join(params)
        pnames = ", ".join(pnames)

        method_str += f"""
    public {self.method.return_type.signature} {self.method.name}({params}) {{"""

        for transform in transforms:
            method_str += f"""
        {transform}"""

        method_str += f"""
        return {self.cls.signature}.{self.method.name}({pnames});
    }}
"""

        self._method_str = method_str
        return self

