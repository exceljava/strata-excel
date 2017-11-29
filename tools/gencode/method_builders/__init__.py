"""
Strata uses various different types of similar looking methods.

The builder classes in this package wrap these different types
of methods so they can be called from Excel.

The types of methods are:

Instance and static methods:
    These are simple instance methods and don't require
    much in the way of wrapper code.

Builder Methods:
    Builder methods are used to construct immutable beans.
    These are wrapped with method that take a lists of
    keys and values and allow objects to be constructed
    from a table in Excel.

Fields:
    Public fields on Strata classes have wrapper methods generated
    so they can be accessed as functions in Excel.

Argument Converters:
    Static methods taking a single argument can be used as argument
    converters. These automatically convert from an Excel argument
    (eg string or double) into the Java type by calling the
    static method.

Field converters:
    Similar to argument converters but rather than calling a static
    method these get a standard instance from a named public field.

Wrapper methods:
    In some cases Strata methods don't fit well into the other
    types and the method has to be hand-coded in the config file.

"""
from .builder import BuilderMethodBuilder
from .method import MethodBuilder
from .arg_converter import ArgConverterBuilder
from .static import StaticMethodBuilder
from .field import FieldMethodBuilder
from .field_converter import FieldConverterMethodBuilder
from .wrapper import WrapperMethodBuilder

_builder_classes = {
    "wrapper": WrapperMethodBuilder,
    "arg_converter": ArgConverterBuilder,
    "field_converter": FieldConverterMethodBuilder,
    "builder": BuilderMethodBuilder,
    "method": MethodBuilder,
    "static": StaticMethodBuilder,
    "field": FieldMethodBuilder
}


def get_method_builder(method_type, cls, method, xlname, **kwargs):
    """Return a method builder for the specified method type."""
    return _builder_classes[method_type](cls, method, xlname, **kwargs)


__all__ = [
    "get_method_builder"
]
