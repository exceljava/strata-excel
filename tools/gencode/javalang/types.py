"""
Python classes for representing Java types parsed from
source files
"""
from itertools import chain
from collections import OrderedDict


class JavaMethod:
    """
    Simple representation of a Java method
    """

    def __init__(self, name, modifiers, parameters, return_type):
        self.name = name
        self.modifiers = set(modifiers)
        self.parameters = parameters
        self.return_type = return_type

    @property
    def is_public(self):
        return "public" in self.modifiers

    @property
    def is_static(self):
        return "static" in self.modifiers

    @property
    def signature(self):
        return "%s %s(%s)" % (self.return_type.signature,
                              self.name,
                              ", ".join(t.signature for n, t in self.parameters))

    def __str__(self):
        return "%s %s %s(%s)" % (" ".join(self.modifiers),
                                 self.return_type,
                                 self.name,
                                 ", ".join("%s %s" % (t, n) for n, t in self.parameters))


class JavaField:
    """
    Simple representation of a Java field
    """

    def __init__(self, name, type, modifiers):
        self.name = name
        self.type = type
        self.modifiers = set(modifiers)

    @property
    def is_public(self):
        return "public" in self.modifiers

    @property
    def is_static(self):
        return "static" in self.modifiers


class JavaType:

    def __init__(self, name, package=None, arguments=None):
        self.name = name
        self.package = package
        self.arguments = arguments

    @property
    def imports(self):
        """set of imports needed for this type"""
        imports = set()
        if self.package:
            imports.add(self.package + "." + self.name.split(".")[0])
        if self.arguments:
            imports.update(*chain((x.imports for x in self.arguments)))
        return imports

    @property
    def signature(self):
        s = self.name
        if self.arguments:
            s += "<" + ", ".join((a.signature for a in self.arguments)) + ">"
        return s

    def __str__(self):
        s = (self.package + "." if self.package else "") + self.name
        if self.arguments:
            s += "<" + ", ".join(map(str, self.arguments)) + ">"
        return s

    def __eq__(self, other):
        return str(self) == str(other)


class JavaClass(JavaType):
    """
    Simple representation of a Java class and its public methods
    """

    def __init__(self,
                 source_path,
                 decls_start_line,
                 name,
                 package,
                 methods,
                 fields=[],
                 arguments=None):
        super().__init__(name, package, arguments)
        self.source_path = source_path
        self.decls_start_line = decls_start_line
        self.methods = OrderedDict()
        for m in methods:
            self.methods.setdefault(m.name, []).append(m)
        self.fields = list(fields)

    @property
    def type(self):
        return JavaType(self.name, self.package, self.arguments)

    def __str__(self):
        methods = chain(*[v for k, v in sorted(self.methods.items())])
        name = super().__str__()
        return "class %s:\n    %s" % (name, "\n    ".join(map(str, methods))) + "\n"

    def __eq__(self, other):
        return str(self.type) == str(other.type)
