/*
What is inheritance?
Inheritance is the idea of having classes sub-class each other. You can create
a class that inherits all of the properties and methods of another class. In
Java, a class can only inherit from one other class. The relationship is often
called a parent-child relationship, where the class inherited from is the
parent and the class that is inheriting is called the child.
*/

/*
In this case, Vehicle will be our parent class, and Car will be our child class.
*/

public class Inheritance {
  public static void main(String[] args) {
    Vehicle ufo = new Vehicle("alien science", 9001); // OVER 9000!!!!
    // This shouldn't be anything new, if you've gone over the Classes example.

    Car teslaRoadster = new Car(300); // One can always hope, right?

    System.out.println("UFO position: " + Integer.toString(ufo.getPosition()));
    ufo.move();
    System.out.println("UFO position after moving: " +
      Integer.toString(ufo.getPosition()));

    System.out.println("Tesla position: " +
      Integer.toString(teslaRoadster.getPosition()));
    teslaRoadster.move(); // This should print out "Gotta go faaaast!"
    System.out.println("Tesla position after moving: " +
      Integer.toString(teslaRoadster.getPosition()));
  }
}
