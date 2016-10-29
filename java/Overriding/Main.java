/*
  What is overriding?
  Overriding is when a subclass changes the behavior in its version of a
  superclass-defined method. Basically, if the parent class has defined a
  method, you can choose to provide a different behavior. You can still
  use the superclass's method, as well.
*/

class Main {
  public static void main(String[] args) {

    /*
      Here are our two objects. TrashBin inherits from Bin.
    */
    Bin theBin = new Bin();
    TrashBin trash = new TrashBin();

    /*
      See the Bin's behaviors...
    */
    theBin.openLid();
    theBin.store(new Object());

    /*
      Notice how the TrashBin's behaviors are different, but the
      method names are the same.
    */
    trash.openLid();
    trash.store(new Object());
  }
}
