def square_of_two_count(num):
    if(num == 2):
        return 0
    num //= 2
    print("num is now", num)
    return square_of_two_count(num) + 1

count = square_of_two_count(512)
print("final count:", count)

# That was a brief refresher because recursion can be messy

"""
    TODO: Define a function called factorial. Have it
    return the factorial of the given input
"""

"""
    TODO: Define a function called multiply. Have it
    do multiplication only using addition and recursion
"""