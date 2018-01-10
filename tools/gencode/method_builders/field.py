from .base import MethodBuilderBase


class FieldMethodBuilder(MethodBuilderBase):
    """
    Builder for field wrappers
    """

    def __init__(self, cls, field, xlname):
        super().__init__(cls, field, xlname)
        self.field = field
        if not field.is_public:
            raise RuntimeError(f"{cls.name}.{field} is not public")
        self._method_str = None

    def __str__(self):
        return self._method_str

    def build(self, all_classes):
        self.imports.update({
            "com.exceljava.jinx.ExcelFunction",
            "com.exceljava.jinx.ExcelArguments",
            "com.exceljava.jinx.ExcelArgument"
        })

        self.imports.update(self.field.type.imports)

        method_str = f"""
    @ExcelFunction(
        value = "{self.xlname}",
        category = "{self.category}",
        isThreadSafe = true
    )"""

        if self.field.is_static:
            method_str += f"""
    public {self.field.type.signature} {self.field.name}() {{
        return {self.cls.signature}.{self.field.name};
    }}
    """
        else:
            self_name =  self.cls.name[0].lower() + self.cls.name[1:]
            method_str += f"""
    @ExcelArguments({{
        @ExcelArgument("{self_name}")
    public {self.field.type.signature} {self.field.name}({self.cls.signature} {self_name}) {{
        return {self_name}.{self.field.name};
    }}
    """

        self._method_str = method_str
        return self

