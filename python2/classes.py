#!/bin/env python2.7

class Vehicle:
# This is how we define a class for a Vehicle. Very simple.

    kind = 'vehicle'
    # This is a class variable. This is called by doing something like
    # Vehicle.kind. This would effectively be a global variable.

    def __init__(self):
    # This is how we define a constructor. A constructor is a function
    # that creates a new instance of the class (an object) and returns
    # that new instance, though it doesn't need to explicitly return it.
    # Note that all functions that occur on an object _must_ take "self"
    # as their first parameter. Otherwise, they're class objections, which
    # can be covered later.

        self.wheels = 0
        # "self" references the current object instance of the class

    def drive(self):
        print "I'm driving on " + str(self.wheels) + " wheels!"
        # This is an object function. It can only be executed when we have
        # an instance of a vehicle.


vehicle1 = Vehicle() # Here, we create a new vehicle object
# But where did Vehicle() come from? The __init__ function above
# takes on the name of the class it's being defined on.
# Again, this is called a constructor and returns an object instance
# of the class it's defined on.

print 'vehicle1.wheels: ' + str(vehicle1.wheels)
# What do you think will be printed out here?
vehicle1.drive()
# How about here?

# What if we do this?
vehicle2 = Vehicle()
vehicle2.wheels = 2
print 'vehicle2.wheels: ' + str(vehicle2.wheels)
# What do you expect to be output here?

print 'vehicle1.wheels: ' + str(vehicle1.wheels)
# Would this have changed?


# What do you think these will output?
vehicle1.drive()
vehicle2.drive()
