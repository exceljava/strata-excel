"""
Reads all the .yaml files in the config folder and creates Jinx
wrapper classes for the Strata classes listed in the config.

The config files are of the form:

<package>.<class>:
    <method> [: options]

Where options can include:
    - method: actual method name if different from the one used in Excel
    - type: method type (usually determined automatically)
    - signature: method signature if overloads exist
    - wrapper: Java code to be used for the wrapper method (not usually required)
"""
from .class_builder import build_wrapper_class, get_wrapper_class_name
from .javalang import get_class_info
import argparse
import logging
import fnmatch
import yaml
import os

_log = logging.getLogger()


def _load_config():
    """loads the config files relative to this folder"""
    config = {}
    path = os.path.join(os.path.dirname(__file__), "config")
    for dirpath, dirname, filenames in os.walk(path):
        for filename in fnmatch.filter(filenames, "*.yaml"):
            with open(os.path.join(dirpath, filename)) as fh:
                config.update(yaml.safe_load(fh) or {})
    return config


def main():
    parser = argparse.ArgumentParser(description="Generate Strata-Excel wrappers")
    parser.add_argument("--source", help="Strata source directory", required=True)
    parser.add_argument("--output", help="Folder to write output files to", required=True)
    parser.add_argument("--resources", help="Folder to write resource files to", required=False)
    parser.add_argument("--log-level", help="Logging level (eg DEBUG or INFO)", default="INFO")
    args = parser.parse_args()

    log_level = args.log_level.upper()
    if not hasattr(logging, log_level):
        raise argparse.ArgumentError("Invalid log level '%s'" % log_level)
    logging.basicConfig(level=getattr(logging, log_level))

    source_root = args.source
    output_path = args.output
    resources_path = args.resources

    # get the list of classes to wrap from the config
    config = _load_config()

    # parse all the class files first
    all_classes = {}
    for cls in config.keys():
        all_classes.update(get_class_info(source_root, cls))

    # then build the wrapper for each class
    for cls in sorted(config.keys()):
        wrapper_name = get_wrapper_class_name(cls)
        strata_class = all_classes[cls]
        wrapper = build_wrapper_class(wrapper_name,
                                      strata_class,
                                      config,
                                      all_classes)

        path = os.path.join(*wrapper_name.split(".")) + ".java"
        path = os.path.join(output_path, path)
        if not os.path.exists(os.path.dirname(path)):
            os.makedirs(os.path.dirname(path))

        if os.path.exists(path):
            with open(path) as fh:
                existing = fh.read()

            if existing == wrapper:
                _log.info(f"No change to {path}")
                continue

        with open(path, "w") as fh:
            _log.info(f"Writing output {path}")
            fh.write(wrapper)

    if resources_path:
        # get all the classes, not just the auto-generated ones
        xl_wrappers = set()
        for dirpath, dirnames, filenames in os.walk(output_path):
            for filename in filenames:
                name, ext = os.path.splitext(filename)
                if ext == ".java":
                    package = os.path.relpath(dirpath, output_path).replace(os.path.sep, ".")
                    xl_wrappers.add(package + "." + name)

        with open(os.path.join(resources_path, "jinx-classes.txt"), "wt") as fh:
            print("# Strata-Excel classes", file=fh)
            for cls in sorted(xl_wrappers):
                print(cls, file=fh)
    else:
        for cls in sorted(xl_wrappers):
            print(cls)
