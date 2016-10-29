public class Car implements Drivable, Rideable {
  public void ignition() {
    System.out.println("The car is starting!");
  }

  public void drive() {
    System.out.println("The car is driving!");
  }

  public void openDoor() {
    System.out.println("Opening door!");
  }

  public void acceptPassenger(Object obj) {
    System.out.println("Passenger " + obj.toString() + " entered!");
  }
}
