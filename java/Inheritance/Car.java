public class Car extends Vehicle {
/*
Extends?! What's that?!
Extends is how you indicate an inheritance relationship. That one phrase,
"extends Vehicle," causes Car to inherit from Vehicle. This means that
Car has all the properties and methods that Vehicle has. Maaaagic.
*/

  public Car(int speed) {
    super("wheels", speed);
    /*
    Super is a way of referencing the parent class, and when used alone, its
    constructor. In this case, since a car always has wheels, we're just doing
    what the parent class does, and giving the vehicle (car) wheels. This makes
    things easy. This one line handles the assignment of propulsionType and
    speed. Easy mode.
    */
  }

  public void honk() {
  /*
  We can also add additional functionality to the child class, like honking.
  */
    System.out.println("Honk!");
  }

  @Override
  public void move() {
    super.move();
    System.out.println("Gotta go faaaast!");
    /*
    Normally, you'd expect this to complain, since the parent class already has
    a method called "move." However, child classes have the ability to
    "override" a parent class' method. That's what the @Override says we're
    doing. The child method effectively replaces method as defined by the
    parent, but you can still reference the parent class' method using super.
    */
  }
}
