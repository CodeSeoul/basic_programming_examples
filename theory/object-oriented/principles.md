# Object-Oriented Principles

* Encapsulation
* Abstraction
* Inheritance
* Polymorphism

## Encapsulation
Encapsulation is the idea of bundling logic into discrete components. In object-oriented languages, these components are often packages, objects, and functions. You can pass these components around portions of your code, and they will carry inside them various bits of logic. This makes passing information and functionality easy. Encapsulation is also used to limit access to certain portions of information. This, effectively, can keep other programmers that interact with your code from accidentally shooting themselves in the foot.
For additional reading, see [the wikipedia page](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)).

## Abstraction
Abstraction is the idea of having components of information abstractly represent objects in real life, hence the concept of "object-oriented" programming. You can define a type of object called a "ball," and define attributes and behaviors on that object that represent what a real-world ball might do.
Abstraction can also mean hiding the details of a body of logic for the purpose of simplicity. This is enabled by encapsulation. For example, if there's a function called "insertToDatabase," you don't necessarily need to know how it inserts data to the database. From the name, you can tell what it does, and there is no need to worry about the details. The details of how it carries out the data insertion is abstracted from you.
For additional reading, see [the wikipedia page](https://en.wikipedia.org/wiki/Abstraction_(software_engineering)#Abstraction_in_object_oriented_programming).

## Inheritance
Inheritance is the idea of allowing one object to inherit properties and behaviors from other objects. For example, if I have an object called "Vehicle," I can give it behaviors like "turnOn" and "move." I can the define an object called "Car," which might inherit from "Vehicle." The car will then have the ability to "turnOn" and "move" without any additional code. This favors the concept of DRY - or Don't Repeat Yourself. There is no need to redefine "turnOn" within "Car" if a "Vehicle" already defines it.
For additional reading, see [the wikipedia page](https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming)).

## Polymorphism
Polymorphism literally means to have many shapes. Polymorphism is partially an extension of inheritance. If I have a "Car" that inherits from a "Vehicle," I know that a "Car" can do anything a "Vehicle" can. In my code, I can then treat a "Car" as a "Vehicle" without any problems. This allows you to have complex inheritance trees while still making it easy to work with individual types of objects en masse.
For additional reading, see [the wikipedia page](https://en.wikipedia.org/wiki/Polymorphism_(computer_science)).
