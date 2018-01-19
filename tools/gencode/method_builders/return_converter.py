from .base import MethodBuilderBase
from .static import StaticMethodBuilder
from .method import MethodBuilder
from itertools import chain


class ReturnConverterBuilder(MethodBuilderBase):
    """
    Some Strata classes can be converted automatically to
    basic Excel types. This class generates the code to
    do that.
    """

    def __init__(self, cls, method, xlname):
        super().__init__(cls, method, xlname)
        self.__method_str = None

        if method.is_static:
            if len(method.parameters) != 1:
                raise RuntimeError("Static argument converter methods must take one parameter")

            if str(method.parameters[0][1]) != str(cls.type):
                raise RuntimeError(f"Parameter type of static {method.name} must be {cls.type}")

            self.__builder = StaticMethodBuilder(cls, method, xlname)
            self.__input_type = method.parameters[0][1]
        else:
            if str(method.return_type) == str(cls.type):
                raise RuntimeError(f"Return type of non-static {method.name} must not be {cls.type}")

            if len(method.parameters) != 0:
                raise RuntimeError("Non-static argument converter methods must not take any parameters")

            self.__builder = MethodBuilder(cls, method, xlname)
            self.__input_type = cls.type

    def __str__(self):
        return self.__method_str

    @property
    def input_type(self):
        return self.__input_type

    def build(self, all_classes):
        # build the method string the same as for a static method
        builder = self.__builder.build(all_classes)

        # and add the ExcelArgumentConverter annotation
        self.imports.add("com.exceljava.jinx.ExcelReturnConverter")
        self.imports.update(builder.imports)
        self.__method_str = """
    @ExcelReturnConverter""" + str(builder)
        return self
