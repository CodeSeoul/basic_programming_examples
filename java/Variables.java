/*
How to run:
  Open a command line
  Navigate to the folder where this file is
  Run "javac Variables.java"
  Run "java Variables"
*/

/*
What's a variable?
A variable is a way to store changeable data. For example,
let's say you're making a game, and you're going to have a character move
across the screen. You need some way to track the character's position so you
know where on the screen to draw them. This is just one of the millions of
examples where a variable, or more likely, many variables, are critical to
making programs.
*/

public class Variables {
  public static void main(String[] args) {
    int x;
    /*
    This is an example of _declaring_ a variable. In the line above,
    we're defining a variable called "x." "int" is the data type of x.
    In Java, you must explicitly call out the kind of data a variable will
    store. In this case, x will store an integer, or a whole number,
    which Java calls "int."
    */

    x = 5;
    /*
    This is how you set a variable. Easy mode. Setting a variable for
    the first time is called _initializing_ it.
    */

    int y = 5;
    // You can do declaration and initialization in the same step.

    System.out.println("X is " + x);
    // You can use them in functions, which we'll cover later.

    int sum = x + y;
    // You can also use them in other operations
    System.out.println("x + y = " + sum);
  }
}
