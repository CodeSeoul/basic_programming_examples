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


    // Here's a bonus. You ready for this?
    Vehicle definitelyNotACar = new Car(777);
    /*
    But I thought the type you declare a variable as has to match what you're
    storing in it!
    It does.
    This is an example of a concept called "polymorphism," which literally means
    "many shapes." Since a Car _must_ do everything a Vehicle can do, Java lets
    us treat cars as vehicles. This would be useful if you wanted to store
    a collection of many vehicles of different types. You could declare the
    collection to store Vehicles in it, and you could then populate it with
    cars, trucks, ufos, and anything else that you define that might inherit
    from vehicle.
    */
    System.out.println("Definitely not a car...");
    definitelyNotACar.move();
    System.out.println("...certainly acts like a car.");
  }
}
