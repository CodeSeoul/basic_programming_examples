/*

In programming tradition, we'll start with Hello World. Hello World is simple: it's a program that prints the text "Hello world!" to the screen. It's used as a way to ensure that your development pipeline is properly setup. With that, let's get started.

First, you'll want to download the JDK from Oracle (or OpenJDK if you're super fancy). JDK is short for Java Development Kit. It has the tools you need to start writing Java programs. The installation process should be pretty straightforward, regardless of your platform.

The Java executables _should_ set themselves up in your environment path (more on pathing in the theory section). If not, you should use your search engine of choice to find out how to add Java to the path on your system, e.g. "add Java to Windows path."

Once you have the JDK and your path setup, you should try to compile and run this file. You can compile the file by navigating to this directory (see command line, if that's not your jam) and entering "javac 001_hello_world.java". After doing so, you'll see a file 001_hello_world.class. This is Java bytecode that you can then run using the Java virtual machine. Now, run "java HelloWorld." Maaaaaagic :D

We use HelloWorld in the second command because our class below is called HelloWorld. More on that later.

*/

// This is a single-line comment
/*
This, if you hadn't guessed, is a multi-line comment.

Comments are text that is not executed by the program. They're often used to add informative "comments" to your code.
*/

// This is a class. We'll cover this later.
public class HelloWorld {

  // This is the function that runs when you run this class as the main program. Don't worry about how or why quite yet. Just know it does the thing.
  public static void main(String[] args) {

      System.out.println("Hello world!");
      // This will print out Hello World to your command line. System is a variable that Java exposes to you. In object-oriented land, something like System can have other data inside it, in this case out. Out represents the data stream that prints to stdout, which is your command line. Println is a function that prints a line of text.
      // Using this line is a good way to print out information to help you determine how your application is behaving.
      // This is an example of calling a function. What is a function? A function is a way to represent a larger body of code simply. You can also give inputs to a function, called "parameters."

      int x;
      // This is an example of _declaring_ a variable. A variable is a way to store changeable data. In the line above, we're defining a variable called "x." "int" is the data type of x. In Java, you must explicitly call out the kind of data a variable will store. In this case, x will store an integer, which Java calls "int."

      x = 5;
      // This is how you set a variable. Easy mode. Setting a variable for the first time is called _initializing_ it.

      int y = 5;
      // You can do declaration and initialization in the same step.

      int sum = addWithOutput(x, y);
      // Below, we're defining our own function called "addWithOutput," and we're giving x and y to it as parameters. Can you guess what value sum will have stored inside it?

      addWithoutOutput(x, y);
  }

  private static int addWithOutput(int a, int b) {
  /*
  This an example of a function declaration. This first line is called a function signature.
  "private" represents the visibility of the function. Other keywords you can place here are "protected" and "public." Private means that only the class this function is defined inside can access it. Protected means any classes that inherit from this class can use it. We'll cover what that means much later. Public means that anything anywhere can use this function.
  "int" is where you define the type of data this function spits out. In this case, we're going to produce an integer as output.
  addWithOutput is the function name.
  (int a, int b) is our parameter listing. This defines the data that the function can take as inputs. It requires the data type and a name for the data that you can use within the function. In this case, whatever value is provided as the first parameter will be called "a," and the second parameter's data will be referred to as "b." This is independent of whatever the data was called before it was given to the function.
  // Ignore static for now :^)
  */

    return a + b;
    // Return is a keyword that ends the function and passes whatever value after it as output. In this case, we're outputting the sum of a and b.
  }

  private static void addWithoutOutput(int a, int b) {
    // void is not a data type. Void means that this function produces no output. This specific function effectively does nothing. This would be useful if we need to internally modify some data but don't need to provide any output.

    int useless = a + b;

    return; // See? not returning anything. Technically, this line isn't even required.
  }
}
