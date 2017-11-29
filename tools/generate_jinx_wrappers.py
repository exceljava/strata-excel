"""
The Strata package is exposed to Excel via the Jinx Excel Addin.

This script generates classes with annotated methods wrapping
the Strata library enabling it to be called from Excel.
"""
import gencode
import sys

if __name__ == "__main__":
    sys.exit(gencode.main())
