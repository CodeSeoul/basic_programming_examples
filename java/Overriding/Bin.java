public class Bin {

  /*
    The store method simply prints out "Storing " and the string
    representation of the object
  */
  public void store(Object obj) {
    System.out.println("Storing " + obj.toString());
  }

  /*
    The openLid method simply prints out that the lid is opening
  */
  public void openLid() {
    System.out.println("Opening lid...");
  }
}
