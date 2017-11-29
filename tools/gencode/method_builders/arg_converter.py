from .static import StaticMethodBuilder
from itertools import chain


class ArgConverterBuilder(StaticMethodBuilder):
    """
    Some Strata classes can be converted automatically from
    basic Excel types. This class generates the code to
    do that.
    """

    def __init__(self, cls, method, xlname):
        super().__init__(cls, method, xlname)
        if not method.is_static:
            raise RuntimeError("Argument converter methods must be static")

        if str(method.return_type) != str(cls.type):
            raise RuntimeError(f"Return type of {method.name} must be {cls.type}")

    def build(self, all_classes):
        # build the method string the same as for a static method
        super().build(all_classes)

        # and add the ExcelArgumentConverter annotation
        self.imports.add("com.jinx.ExcelArgumentConverter")
        self._method_str = """
    @ExcelArgumentConverter""" + self._method_str
        return self
