public class Vehicle {

  private String propulsionType;
  private int speed;
  private int position; // this vehicle lives in a one-dimensional world :^)

  public Vehicle(String propulsionType, int speed) {
    this.propulsionType = propulsionType;
    this.speed = speed;
    this.position = 0;
    // You get constructors by now :D
  }

  public void move() {
    this.position += speed;
    /*
    The += operator adds the following value to the value of the variable and
    assigns the variable to the new value. There are also -=, *=, and /=;
    */
  }

  public int getSpeed() {
    return this.speed;
  }

  public String getPropulsionType() {
    return this.propulsionType;
  }

  public int getPosition() {
    return this.position;
  }
}
