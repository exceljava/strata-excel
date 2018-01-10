from .base import MethodBuilderBase


class FieldConverterMethodBuilder(MethodBuilderBase):
    """
    Builds a method for converting to a Java type by
    looking up a static field by name.
    """

    def __init__(self, cls, field, xlname):
        super().__init__(cls, field, xlname)
        self._method_str = None

    def __str__(self):
        return self._method_str

    def build(self, all_classes):
        self.imports.add("com.exceljava.jinx.ExcelArgumentConverter")

        cls_type = str(self.cls.type)
        fields = []
        for field in self.cls.fields:
            if field.is_public and field.is_static and str(field.type) == cls_type:
                self.imports.update(field.type.imports)
                fields.append(field)

        method_str = f"""
    @ExcelArgumentConverter
    @ExcelFunction(
        value = "{self.xlname}",
        category = "{self.category}",
        isThreadSafe = true
    )
    @ExcelArguments({{
        @ExcelArgument("fieldName")
    }})
    public {self.cls.signature} getStaticField(String fieldName) {{
        if (null == fieldName) {{
            throw new IllegalArgumentException("fieldName is null");
        }}"""

        for field in fields:
            method_str += f"""
        if (fieldName.equals("{field.name}")) {{
            return {self.cls.signature}.{field.name};
        }}"""

        method_str += f"""
        throw new IllegalArgumentException(String.format("%s is invalid", fieldName));
    }}"""

        self._method_str = method_str
        return self

