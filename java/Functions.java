/*
How to run:
  Open a command line
  Navigate to the folder where this file is
  Run "javac Functions.java"
  Run "java Functions"

After this, we're going to assume you know how to compile and run
a Java file.
*/

/*
What's a function?
A function is a way to package up a whole bunch of code into one line. It's
a core part of being "DRY", which means "Don't Repeat Yourself." Rule of thumb,
if you have the same code three or more times, it should really be a function.
Functions also improve readability. If you have a function like
"addPlayerToTeam", you can guess what that function does and not
need to worry about how it does it internally.
Let's dive right in.
*/

public class Functions {
  public static void main(String[] args) {
      int x = 5;

      int sum = addWithOutput(x, 4);
      /*
      This is an example of a function call. Below, we've defined our own
      function called "addWithOutput". You can notice functions pretty quickly,
      as they'll end with parenthesis. Functions are capable of taking in
      pieces of data and using that data to affect what they do. In this case,
      the addWithOutput function also outputs some data, which we're storing
      in a variable called sum.
      */

      System.out.println("sum: " + sum);
      // What do you think will be print to the screen?

      addWithoutOutput(x, 7);
      /*
      This will do nothing. See if you can understand why once you read
      about this function below.
      */
  }

  private static int addWithOutput(int a, int b) {
    /*
    This an example of a function declaration. This first line is called a
    function signature.

    "private" represents the visibility of the function. Other keywords you can
    place here are "protected" and "public." Private means that only the class
    this function is defined inside can access it. Protected means any classes
    that inherit from this class can use it. We'll cover what that means much
    later. Public means that anything anywhere can use this function.

    "int" is where you define the type of data this function spits out. In this
    case, we're going to produce an integer as output.

    addWithOutput is the function name.

    (int a, int b) is our parameter listing. This defines the data that the
    function can take as inputs. It requires the data type and a name for the
    data that you can use within the function. In this case, whatever value is
    provided as the first parameter will be called "a," and the second
    parameter's data will be referred to as "b." This is independent of whatever
    the data was called before it was given to the function.

    Ignore static for now :^)
    */

    return a + b;
    /*
    Return is a keyword that ends the function and passes whatever value
    after it as output. In this case, we're outputting the sum of a and b.
    */
  }

  private static void addWithoutOutput(int a, int b) {
    /*
    void is not a data type. Void means that this function produces no output.
    This specific function effectively does nothing. This would be useful if
    we need to internally modify some data but don't need to provide any output.
    */

    int useless = a + b;

    return;
    // See? not returning anything. Technically, this line isn't even required.
  }
}

/*
In summary, functions are defined somewhere. They are then called elsewhere.
They can even call themselves, but more on that later. Again, functions help
keep your code simple. They're absolutely vital to almost all code you'll
write in the future.
*/
