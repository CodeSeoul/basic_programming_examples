def square_of_two_count(num):
    if(num == 2):
        return 0
    num //= 2
    print("num is now", num)
    return square_of_two_count(num) + 1

count = square_of_two_count(512)
print("final count:", count)

# That was a brief refresher because recursion can be messy

# TODO: Define a function called multiply. Have it do multiplication only using addition and recursion
product = multiply(5, 6)
print("product:", product)

# TODO: Define a function called gcd (or greatest common divisor). It should find the largest number that divides evenly into two given numeric inputs.
divisor = gcd(96, 81)
print("divisor:", divisor)

# TODO: CHALLENGE: Solve the Tower of Hanoi with a function called hanoi
"""
    It consists of three rods, and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.
    The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
    1) Only one disk can be moved at a time.
    2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
    3) No disk may be placed on top of a smaller disk.
    With three disks, the puzzle can be solved in seven moves. The minimum number of moves required to solve a Tower of Hanoi puzzle is 2n - 1, where n is the number of disks.
"""
A = [5, 4, 3, 2, 1]
B = []
C = []
num_steps = hanoi(A, B, C)
print("num_steps:", num_steps)

# TODO: CHALLENGE: Create a binary search function called bsearch. Binary search takes in a sorted collection and keeps cutting it in half until if finds the desired value. It should take in an array and the value being searched for.
collection = [17, 24, 39, 40, 143, 145, 171, 192, 196, 253, 333, 372, 584, 602, 632, 635, 763, 882, 891, 934, 999, 1009, 1131, 1140, 1154, 1222, 1257, 1376, 1408, 1422, 1574, 1647, 1668, 1732, 1889, 1936, 2003, 2023, 2185, 2191, 2207, 2227, 2279, 2284, 2289, 2419, 2448, 2512, 2530, 2539, 2546, 2643, 2647, 2650, 2663, 2676, 2800, 2822, 2838, 2843, 2948, 2980, 2991, 2993, 3000, 3163, 3190, 3202, 3253, 3276, 3281, 3296, 3393, 3474, 3533, 3552, 3576, 3681, 3722, 3791, 3800, 3828, 3849, 3869, 3872, 3939, 3964, 3992, 4016, 4186, 4229, 4232, 4349, 4520, 4541, 4619, 4741, 4856, 4861, 4958]
position = bsearch(collection, 1140)
print("position:", position)
