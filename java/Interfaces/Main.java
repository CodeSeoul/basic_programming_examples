/*
  What are interfaces?
  Interfaces are a way to guarantee an object has certain methods, often
  described as behaviors. They can be essentially used as contracts for
  what objects are capable of. Within an interface, you define a number
  of method signatures - the signature being the output, name, and
  parameters. An object can then implement 0 or more interfaces. By
  implementing an interface, the object MUST have a method definition
  following the method signatures defined by its interface(s)

  What is polymorphism?
  Polymorphism, coming from latin roots of "many forms", allows objects
  down a hierarchy to be treated as others defined up their hierarchy.
  This means that you can declare a variable's type as a superclass or
  interface, then you can store a subclass or implementing class within
  that variable.
*/

public class Main {
  public static void main(String[] args) {
    /*
      Car implements Drivable. We can declare a variable as type
      Drivable, but we can store a Car in it.
    */
    Drivable driveCar = new Car();
    driveCar.drive();

    /*
      This is true of Rideable, too. Car implements both Drivable and
      Rideable.
    */
    Rideable rideableCar = new Car();
    rideableCar.acceptPassenger(new Object());
    //rideabeCar.drive();
    /*
      The above line doesn't work. Why? rideableCar is a Rideable type.
      Rideable only guarantees that the openDoor and acceptPassenger methods
      exist. Since drive isn't guaranteed by Rideable and rideableCar is
      technically the Rideable type, Java doesn't recognize drive as being
      a valid method on rideableCar.
    */

    /*
      This is passed down to any subclasses of Car, as well. Since a
      Sedan does everything a Car can do, it also fulfills the requirements
      for any of the interfaces that Car implements.
    */
    Drivable sedan = new Sedan();
    sedan.drive();
  }
}
