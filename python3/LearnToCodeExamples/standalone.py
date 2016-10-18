#!/bin/env python3

import sys

print('Arguments: ', sys.argv)
print('this file is: ', sys.argv[0])

print("Hello world!")

from report import get_description as des

weather_argument = sys.argv[1]
weather = des(int(weather_argument))
print("Today's weather is ", weather)
