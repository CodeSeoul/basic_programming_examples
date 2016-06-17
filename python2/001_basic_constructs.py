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

x = [1, 2, 3]
# This is a specific kind of collection called a list. A collection is a way to store multiple pieces of data in the same location. This is
# simply another way to store data. Lists, specifically, are collections that are mutable - that is, they can be changed.
# You'll also noticed that we used the variable "x" again. Python allows you to overwrite variable values without any issues.

x = (4, 5, 6,)
# This is another kind of collection called a tuple. A tuple in Python is an immutable collection - that is, it cannot be changed. If
# you want to add or change any values, you can't. You'll need to create a new copy of the tuple.

for num in x:
    print("X is " + str(num))
# There's a LOT going on here. The "for A in B" syntax is called a "for each" loop in most languages, but simply a "for" loop in Python.
# You can use the "for" loop with any type of collection. It allows you to perform operations on each item inside the collection. In this
# case, the collection is "x." For each run of the loop, that is, for each item within the collection, we'll refer to the current item as
# "num" from the for loop above. In Python, the operations that will be performed in the loop are indicated using indentation. In Python,
# whitespace is a critical part of the program. By indenting the print line, we're saying that the print statement should be executed
# for each run of the loop. In this specific print statement, we're printing the text "X is" and the current number. In Python, we need to
# convert the number stored in num to a string (text). We do this with the str() function. Once we have strings, we can append them (or
# concatenate) using the plus sign (+).
# This loop will print out the following text when run:
# X is 4
# X is 5
# X is 6

y = 6
while y <= 10:
    print("Y is now " + str(y))
    y += 1
# This is the "while" loop. It runs its contents until the given condition is not true. Be careful, as you can easily create and endless
# loop if you're not careful. You can do the same in a for loop, but it's less common. In this case, as long as the value of "y" is less
# than or equal to 10, the loop will keep running. In this case, it will print the value of y and then increase y. The operator += adds
# the following value to the value of the variable and stores the sum back into the variable. There are also -=, *=, and /= operators.
# This loop will print out the following text when run:
# Y is now 6
# Y is now 7
# Y is now 8
# Y is now 9
# Y is now 10

if y == 10:
    print("Y is 10!")
elif y == 11:
    print("Y is 11!")
else:
    print("Sad panda")
# This is an "if" condition. This allows you to only run certain bodies of code when certain conditions are met. In this case, if y's
# value is 10, it will print "Y is 10!" The == operator is a comparison operator. Don't confuse this with the assignment operator (=)!
# The elif keyword is short for "else if." It will run its code body in the case when preceding ifs are false AND its condition is true.
# The else keyword's code body is only run when none of the other conditions within the same if block evaluate to true.

def printStuff(input):
    print("I was told to print: " + input)
# This is a function definition. Remember how "print" is a function? We can define our own as needed. Function definitions start with
# the keyword "def" followed by the function name, followed by a listing of the inputs (parameters) within parenthesis. The definition
# line must end with a colon, just like loops and conditions. The inputs list is simply a set of names for the values the function accepts.
# You can then use these values as you please within the function. In this case, we're simply printing the input within a larger print
# statement. Alone, this definition will have no output or product. It simply defines a new thing that's capable of being done without
# actually doing it.

printStuff("i herd u lyk mudkips")
# This is an example of executing the above function. This line will cause the output to be the following:
# I was told to print: i herd u lyk mudkips

# This concludes basic constructs. GLHF
