# What are classes and objects?
# Classes are ways to define our own data structures in code that
# have their own variables (attribute/properties) and
# functions (methods). Objects are when you create "real-world"
# instances of these classes. You can think of a class like a
# blueprint and an object like the building made from the
# blueprint.

# You can define a class with the keyword "class" followed by
# the class name and a colon
class Vehicle:
    # __init__ is a special type of method called a constructor.
    # You can create a new Vehicle object by using the class
    # name as if it were a method, such as Vehicle().
    # The constructor is a method that is called when you do this.
    # Like any other method, a constructor can take in parameters,
    # just like we've done below.
    # You can also make parameters optional. You do this by giving
    # them a default value using =. If a default value is defined
    # for a parameter, and that parameter is omitted when the
    # method is called, the parameter's value will be the default.
    # In this case, when you call the method, you can provide a
    # parameter out of order by name, like Vehicle(size='small')
    # In this case, num_wheels would be 4, year would be 2016,
    # but size would be "small"
    # Lastly, all object methods should use "self" as their first
    # parameter. This allows the method to access the object it's
    # being called from. Technically, this could be any name
    # besides "self," but traditionally, self is used.
    if __name__ == '__main__':
        def __init__(self, num_wheels=4, size='big', year=2016):
            print("Vehicle created!")
            # We can set attributes on objects using the below syntax
            self.__num_wheels = num_wheels
            self.size = size
            self.year = year
            # This means that any Vehicle instance will have
            # num_wheels, size, and year as attributes. Each
            # Vehicle's value for these attributes is distinct from
            # one another. This concept is called encapsulation
            # Bear in mind that self.size is distinct from size.
            # self.size is the size defined on the object, and
            # size is the size given as a parameter to the method.
            # Why does num_wheels have two underscores? This has
            # Python "mangle" the name. Mangling is changing
            # something for the purpose of obfuscating it.
            # Python uses name mangling to make an attribute
            # "private" or unable to be accessed by outside objects.

    # Just like outside of classes, we can define arbitrary methods,
    # but we need to make sure they take in a self parameter.
    def drive(self):
        print("I'm driving on", \
              self.__num_wheels, \
              "wheels!")

    # __str__ is another built-in method worth mentioning. If you
    # ever provide a Vehicle instance as an input to print(),
    # print will use whatever is returned by the object's
    # __str__ method
    def __str__(self):
        return "A vehicle with " + str(self.__num_wheels) + " wheels"

    # Remember that we mangled num_wheels by defining it with two
    # underscores in front?
    # We can still make it accessible by using the @property
    # decorator. The property decorator (or annotation) allows
    # us to treat the num_wheels() method as if it were an
    # attribute, but it allows us the flexibility of a method.
    # Like in this example below, you can force some sort of
    # logic to occur whenever someone tries to retrieve the
    # property/attribute.
    # If you want to allow other objects to actually retrieve
    # the attribute value, make sure to return it!
    # This is called a "getter"
    # Basically, the block below allows us to do something
    # like myVehicle.num_wheels to retrieve the value in
    # __num_wheels, but doing so causes the print statement
    # to execute.
    @property
    def num_wheels(self):
        print("called num_wheels like a property")
        return self.__num_wheels

    # After you've defined a property and its getter, you can
    # also define a "setter," which is executed when one
    # tries to assign a new value to the property, like
    # num_wheels = 5
    # By defining a setter, we get the same flexibility
    # that the getter provides. You could even not
    # set the attribute to the new value.
    # If you want to prevent a property from being
    # altered and don't want to execute any sort of logic,
    # you can just not define a setter. If someone tries to
    # change the property value, Python will complain, saying
    # that you cannot set the attribute.
    @num_wheels.setter
    def num_wheels(self, num_wheels):
        print("Changing the wheels on this vehicle!")
        self.__num_wheels = num_wheels


# Here, we're defining a second class, Car. In this case, Car
# is "inheriting" from Vehicle. This means that Car automatically
# has all of the methods defined by Vehicle, and we can
# easily define all of the same attributes.
# When you establish an inheritance relationship, the
# inheriting class is called the "child" class or "subclass."
# The class being inherited from is the "parent" class or
# "superclass."
class Car(Vehicle):

    # Notice that we have a different constructor. No problem.
    def __init__(self, color='black'):
        # If the superclass does things we want to keep doing
        # in the child class, you can use the below to call
        # the parent class's constructor.
        super().__init__(year=2014)
        self.__color = color

    # Notice how we're defining __str__ again, much like we did
    # with __init__. When you redefine a method already defined
    # by the parent class, it's called "overriding" the method.
    def __str__(self):
        return "A " + self.__color + " car from " + str(self.year)

    # Let's check out another way of doing getters and setters...
    def get_color(self):
        print("You look at the car")
        return self.__color

    # We can still use these methods like normal methods. You just need
    # to make sure that any additional parameters are optional.
    def set_color(self, color, tone=''):
        print("This car got a paint job!")
        self.__color = tone + ' ' + color

    # This will do the same thing as the property decorators in vehicle.
    # It's just a different way of doing it, but the decorators are
    # a little clearer.
    color = property(get_color, set_color)

    # This is what we were trying to do during class but were having trouble.
    # If you want to override the getter or setter of a superclass, you
    # must reference the superclass by name, first.
    # Something like @num_wheels.setter simply won't work, since that
    # property hasn't been explicitly defined on Car. Since it was defined
    # on Vehicle, the below will work.
    @Vehicle.num_wheels.setter
    def num_wheels(self, num_wheels):
        print("Can't change the number of wheels on a car!")
        # We're actually not going to allow others to change the number
        # of wheels, but we will print something out.


# This is how we create a Vehicle object from our Vehicle class
myVehicle = Vehicle(3)
# Easy, right? Remember our __str__ method? Here it is in action:
print(myVehicle)
# The drive method is still there, too.
myVehicle.drive()

# Remember our num_wheels @property?
# This will act like a normal attribute, but we'll get the print
# out we defined in the num_wheels property method
print("wheels:", myVehicle.num_wheels)

# Here, we define another vehicle. This vehicle's data is
# separate from the first vehicle's data.
secondVehicle = Vehicle()
# Let's prove it: they have different numbers of wheels.
print("second vehicle wheels: ", \
      secondVehicle.num_wheels)
print("first vehicle wheels:", \
      myVehicle.num_wheels)
# Remember our setter? Here that is in action
myVehicle.num_wheels = 2

# A car is just like a vehicle, just not
myCar = Car()
print(myCar)
myCar.drive()
# Here's our color property method in action
print("car color: ", myCar.color)
myCar.color = "blue"
# Remember how our num_wheels setter doesn't allow
# changing the number of wheels but does print
# something? Check it out
myCar.num_wheels = 5
myCar.drive()
# Notice that this below line doesn't do anything.
# The name was mangled, so it's not actually what
# you see below.
myCar.__num_wheels = 5
myCar.drive()
print('color stuff')
# We can still call the get_color method directly
car_color = myCar.get_color()
print(car_color)
# Same with the set_color method
myCar.set_color('blue', 'light')
print(myCar)
