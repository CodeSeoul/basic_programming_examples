/*
What are loops?
Loops allow you to run some version of operations an arbitrary number of
times. Many would argue that loops are what make programming powerful. Need
to generate a million users? Use a loop!
Similar to conditions, whether or not a loop should continue is controlled
by boolean values. We'll see this when we cover each time of loop.
*/

class Loops {
  public static void main(String[] args) {

    /*while(true) {
      System.out.println("I SPEAK THE TRUTH");
    }*/
    /*
    This is an example of the "while" loop.
    This specific example would run forever if it wasn't commented out.
    While loops continue to run while the value within parentheses is true. In
    this case, since the value true can never be false, the loop would
    never stop running.
    When the loop runs, every statement within curly brackets is executed.
    */

    int x = 0;
    // Let's declare a varable, x, to work with
    while(x < 5) {
    // If x is less than 5, the following logic will run:

      System.out.println("X is " + x);
      // Print out the value of X
      x++; // This is equivalent to the below:
      //        x += 1
      //        x = x + 1
      // All three of these add 1 to x
    }
    // This loop will print out 5 times, where x is 0, 1, 2, 3, and 4
    // It ceases to run when x is set to 5

    // DON'T DO THIS
    // I was just making a point :3
    String text = "";
    while(!text.equals("oooo")) {
    // String's "equals" method returns a boolean - true or false. This means
    // it can be used just like a comparison operator (>, <, ==, >=, <=)
      System.out.println("text is " + text);
      text += "o";
    }
    // This will print blank, "o", "oo", and "ooo".
    // Again, once text is set to "oooo", this will cease to run.

    for(int y = 0; y < 10; y++) {
      System.out.println("For y is " + y);
    }
    /* This is a "for" loop. The parentheses contain three steps separated by
    semicolons:
    1) Initialization
    2) Allowance condition
    3) Iteration step
    The initialization step is run before the statements inside the loop
    are executed.
    The allowance condition is the condition that must be met in order
    for the loop contents to run.
    The iteration step is run each time after the statements inside the loop
    have run.

    This type of incrementing loop is the most common.
    It will print y as the following values: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
    */

    for(int i = 10; i > 0; i--) {
      System.out.println("For i is " + i);
    }
    /*
    You can also write for loops in a descending manner. In this case,
    we're decrementing the condition variable instead of incrementing it.
    This will print i as 10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    */
  }
}
