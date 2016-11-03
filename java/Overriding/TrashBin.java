// We establish inheritance with the extends keyword...
public class TrashBin extends Bin {

  /*
    Notice the @Override. Items with an @ before them are called annotations.
    Normally, Java won't let you do this. @Override is built-in to allow
    subclasses to change the behaviors defined by the parent class.
  */
  @Override
  public void store(Object obj) {
    // Instead of printing out "Storing ...", we print out "Trashing..."
    System.out.println("Trashing " + obj.toString());
    // The parent class's behavior no longer runs due to the override.
  }

  /*
    While override allows us to ignore the parent's method, we can still
    use it within the child's method.
  */
  @Override
  public void openLid() {
    /*
      super references the parent class. When we call super.openLid(), we're
      running the logic defined by the parent's version of the method
    */
    super.openLid();
    System.out.println("What do you want to trash?");
  }
}
