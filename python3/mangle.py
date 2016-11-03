print("unicode character ID 7777: \u7777")
print("unicode character ID 7778: \u7778")
print("unicode character ID 0078: \u0078")
print("long unicode character ID 00777777: \U00077777")
print("unicode character by name QUARTER NOTE: \N{QUARTER NOTE}")
print("unicode character by name NOSE: \N{NOSE}")
print("unicode character by name OCTOPUS: \N{OCTOPUS}")
print("octopus unicode ID is 1F419: \U0001F419")

import unicodedata

unicode_name = unicodedata.name('🐙')
print('unicode name for octopus symbol:', unicode_name)
octopus_lookup = unicodedata.lookup(unicode_name)
print("octopus_lookup: ", octopus_lookup)


def unicode_test(value):
    name = unicodedata.name(value)
    value2 = unicodedata.lookup(name)
    print('value="%s", name="%s", value2="%s"' % (value, name, value2))

unicode_test('\u00a2')
unicode_test('\U0001f355')

encoded_octopus = '\N{OCTOPUS}'.encode('utf-8')
print('encoded_octopus: ', encoded_octopus)

broken_ascii = '\N{SLICE OF PIZZA}'.encode('ascii', 'ignore')
print("broken ascii:", broken_ascii)

another_broken_ascii = '\N{CENT SIGN}'.encode('ascii', 'replace')
print('another broken ascii:', another_broken_ascii)

backslach_replace = '\N{QUARTER NOTE}'.encode('ascii', 'backslashreplace')
print('backslash replace:', backslach_replace)

# XML Character Reference Replace
snowman = '\N{SNOWMAN}'.encode('ascii', 'xmlcharrefreplace')
print('snowman:', snowman)


decoded_octopus = encoded_octopus.decode('utf-8')
print('decoded_octopus:', decoded_octopus)

print("here are examples of different substitutions:")
print("%%s: '%s' -- %%s with number: '%s' -- %%d: '%d' -- %%f: '%f'" \
      "-- %%g: '%g'" % ('hi', 5.05000, 5.05000, 5.05000, 5.05000))
print("%%e: '%e' -- %%x: '%x' -- %%o: '%o'" % (5.05000, 5555, 5555))

print("{1} {0} {2}".format('first thing', 'second thing', 'last thing'))
print("{labels} {are} {useful}".format(labels="for fun", are="and", useful="profit"))
print("{five:d} -- {five:10d} -- {five:<10d} -- {five:^10d} -- {fortyfive:x}".format(five=5, fortyfive=45))

test_string = "This is an example string that we will try to match. \n" \
    "010-5555-5555 fake@example.com 서울"

import re
pattern = re.compile(r"This is an (\w+) string")
match_object = pattern.match(test_string)
print(match_object.group(0))
print(match_object.group(1))


