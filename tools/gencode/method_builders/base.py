from abc import ABC, abstractmethod


class MethodBuilderBase(ABC):
    """Abstract base class for the various types of method builders"""

    def __init__(self, cls, method, xlname):
        self.cls = cls
        self.method = method
        self.xlname = xlname
        self.__imports = set(cls.imports)

    @property
    def category(self):
        return "Strata"

    def prepare_parameters(self, parameters):
        """
        Returns a tuple of (method parameters, local names, transforms)

        Where method_parameters is a list of "{type} {name}" strings to
        be used when constructing the method parameters to the wrapped
        method, local_names is a list of names of locals to pass to
        the wrapped methods (usually the same as the parameter names),
        and transforms is a list of extra code fragments to insert in
        the method body to transform the input parameters to the locals
        to pass to the wrapped method (eg arrays to lists).
        """
        params = []
        pnames = []
        transforms = []
        for name, ptype in parameters:
            if ptype.name in {"List", "Collection", "Set", "Iterable"}:
                pname = f"{name}_{ptype.name}"
                params.append(ptype.arguments[0].signature + "[] " + name)
                pnames.append(pname)

                code, imports = self.to_collection(ptype, name)
                transforms.append(f"{ptype.signature} {pname} = {code};")
                self.imports.update(imports)
            else:
                params.append(ptype.signature + " " + name)
                pnames.append(name)
        return params, pnames, transforms

    @staticmethod
    def to_collection(collection_type, local_variable_name):
        """Return a code fragment for creating a collection from a local array.
        Returns (code, imports)
        """
        if collection_type.name in {"List", "Collection", "Iterable"}:
            imports = ["java.util.Arrays"]
            return f"Arrays.asList({local_variable_name})", imports
        elif collection_type.name == "Set":
            imports = ["java.util.Arrays", "java.util.Set", "java.utils."]
            arguments = ", ".join((a.signature for a in collection_type.arguments))
            return f"new HashSet<{arguments}>(Arrays.asList({local_variable_name}))", imports
        else:
            raise Exception(f"Unsupported collection type {collection_type}")

    @abstractmethod
    def build(self, all_classes):
        """Build the code for the method and returns a populated builder.

        all_classes is a dictionary mapping fully qualified class
        names to JavaClass objects.
        """
        pass

    @property
    def imports(self):
        """Imports needed by the method"""
        return self.__imports

    @abstractmethod
    def __str__(self):
        """Method implementation as a string"""
        pass
