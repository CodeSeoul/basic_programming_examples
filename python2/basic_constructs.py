#!/bin/env python2.7

# This is a comment. Lines that start with hashes are comments. Comments are lines that are not interpreted as code and have no effect on the running script.

# The first line is a shebang. Python is an interpreted language, meaning that some other executable on the system takes the code in, interprets it to the OS, then runs it.
# The shebang is used when you tell the OS "run this." It tells the OS that this file should be executed using another file instead of expected to act as an executable itself.
# The shebang is defined by #! (hash + bang = shebang) followed by the path to the executable that can run this file. In this specific case, /bin/env searches 
# the environment for the given parameter, in this case, python2.7. This will look for the python2.7 executable in the places the OS knows that executables live in and will
# use that to execute this file.

x = 5
# This is how you set a variable. Unlike other languages, Python doesn't require declaration. Simply set a variable name equal to a value. Python is "duck typed."
# This means that Python doesn't worry about the type of the value stored in variables. It simply tries to see if it behaves in the manner(s) you try to use it in.
# If it walks like a duck, quacks like a duck, etc, it must be a duck. This is different from languages like Java, where you would write "int x = 5;". In that example,
# you're required to define the type of the variable (int). Python avoids this. Python also doesn't require semicolons to indicate statement terminations.

print("Hello world!")
# This is an example of a function call. Python has a built-in function called print, which prints the given value to the screen. Easy mode. 
# The "given value" is called a parameter. It is the data that is "passed" to the function, or given to it as an input to do some work against.
# In most languages, function calls follow function_name(param1, param2), where function_name is the name of the function and parameters are
# listed in the parenthesis, often separated by commas. Functions are basically shortcuts for code. Within the print function, there are 
# many, many operations that eventually lead to the input being printed to the screen. By defining all of those operations in a function,
# that allows you to just write "print" instead of re-inventing the wheel. You'll want to lookup Python documentation for various functions,
# their purpose, what they take as input parameters, and more.

import urllib2
# This is an import. Python has a very large built-in library, providing hundreds of thousands of useful functions and objects. In Python,
# you import "modules." Modules can have functions and variables defined within them directly or have sub objects inside them.  You can also download
# and install additional modules, created by people other than the Python maintainers. Check out the Python Package Index (or pypi) for more info.
# The urllib2 module is one of the modules used for making web/http requests.

opener = urllib2.build_opener()
# This is an example of calling a function defined within a module. Specifically, the build_opener() function returns an object that allows us to make
# http requests. When a function "returns" something, that means it is outputting that thing. The output is a value of some sort. It can be stored
# in a variable, fed as a parameter to another function, and anything else that you can do with values. In this case, we're storing the opener that
# the build_opener() function returns into a variable we're calling "opener."

response = opener.open("http://google.com")
response_content = response.read()
print("response:")
print(response_content)

# Incomplete. Next, we'll cover wtf the code above means.
