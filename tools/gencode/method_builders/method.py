from .base import MethodBuilderBase
from itertools import chain


class MethodBuilder(MethodBuilderBase):
    """
    Builder for instance method wrappers
    """

    def __init__(self, cls, method, xlname):
        super().__init__(cls, method, xlname)
        self.__method_str = None

    def __str__(self):
        return self.__method_str

    def build(self, all_classes):
        self.imports.update({
            "com.exceljava.jinx.ExcelFunction",
            "com.exceljava.jinx.ExcelArguments",
            "com.exceljava.jinx.ExcelArgument"
        })

        self.imports.update(self.cls.imports)
        self.imports.update(self.method.return_type.imports)
        self.imports.update(chain(*(t.imports for n, t in self.method.parameters)))

        for ptype in [t for n, t in self.method.parameters] + [self.method.return_type]:
            if ptype.package and ptype.package.startswith("com.opengamma.strata"):
                if str(ptype) not in all_classes:
                    raise Exception(f"Class '{ptype}' hasn't been loaded (used by {self.cls.name}).")

        self_param =  (self.cls.name[0].lower() + self.cls.name[1:], self.cls)

        params, pnames, transforms = self.prepare_parameters(self.method.parameters)
        params = ", ".join([f"{self.cls.signature} {self_param[0]}"] + params)
        pnames = ", ".join(pnames)

        annotations = [f'@ExcelArgument("{self_param[0]}")']
        annotations += [f'@ExcelArgument("{n}")' for n, t in self.method.parameters]
        annotations = ",\n".join(("        " + x for x in annotations))

        method_str = f"""
    @ExcelFunction(
        value = "{self.xlname}",
        category = "{self.category}",
        isThreadSafe = true
    )
    @ExcelArguments({{
{annotations}
    }})"""

        method_str += f"""
    public {self.method.return_type.signature} {self.method.name}({params}) {{"""

        for transform in transforms:
            method_str += f"""
        {transform}"""

        method_str += f"""
        return {self_param[0]}.{self.method.name}({pnames});
    }}
"""

        self.__method_str = method_str
        return self
