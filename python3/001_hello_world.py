#!/bin/env python3.5

# This is a comment. Lines that start with hashes are comments. Comments are
# lines that are not interpreted as code and have no effect on the running
# script.

# The first line is a shebang. Python is an interpreted language, meaning that
# some other executable on the system takes the code in, interprets it to the
# OS, then runs it.
# The shebang is used when you tell the OS "run this." It tells the OS that this
# file should be executed using another file instead of expected to act as an
# executable itself.
# The shebang is defined by #! (hash + bang = shebang) followed by the path to
# the executable that can run this file. In this specific case, /bin/env
# searches the environment for the given parameter, in this case, python3.5.
# This will look for the python3.5 executable in the places the OS knows that
# executables live in and will use that to execute this file.
# On Windows 10, you may not want to use the shebang, since Windows 10 tries to
# interpret the shebang but doesn't have the same utilities as Linux / OS X.
# Older versions of Windows should be just fine, as long as the file name ends
# in .py

print("Hello world!")
# This is how you print to the console in Python3. It's that simple.
# Whatever is in the quotes will print.
