package org.l2csl.classes;

/*
  The keyword "extends" establishes an inheritance relationship.
  When one class (the subclass or child class) inherits from another class
  (the superclass or parent class), the subclass automatically has
  all of the properties and methods defined that the superclass does.
  This allows you to write less code and permits polymorphism, which we'll
  cover later.
*/
public class Car extends Vehicle {
/*
  In this case, Car is the subclass, and Vehicle is the superclass
  Car already has its own numWheels, speed, and color, since it inherits
  from Vehicle
*/
    public Car(int speed, String color) {
        super(4, speed, color);
        /*
          "super" here is reference Vehicle's constructor. We can use
          Vehicle's construct as part of Car's constructor, adding to it if
          we want to.
        */
    }

    // Since Car inherits from Vehicle, it already has a drive method
}
