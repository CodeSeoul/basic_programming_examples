public class Sedan extends Car {
  @Override
  public void ignition() {
    System.out.println("The sedan is starting!");
  }

  @Override
  public void drive() {
    System.out.println("The sedan is driving!");
  }
}
