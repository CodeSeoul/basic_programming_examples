#!/bin/env python2.7

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
