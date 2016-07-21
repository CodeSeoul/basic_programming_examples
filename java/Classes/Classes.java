/*
What is a class?
A class is a definition for a reproducible and reusable object. What's an
object? An object in programming is a data structure that holds data and
provides methods. You can pass objects around, modify their data, and use
them to carry out operations.
*/

/*
You'll want to reference other files in this directory as well. In Java,
you generally define one class per file. To show things in a useful manner,
we'll be using multiple classes and, therefore, multiple files.
*/

public class Classes {
  public static void main(String[] args) {
    Starter starter = new Starter(5);
    /*
    This is an example of creating a new instance of a class. What is Starter?
    It's a class we defined in another file, Starter.java. The "new" keyword
    makes it painfully clear that we're creating a new instance of a class.
    The Starter method is an object constructor, which we describe in
    Starter.java. You should go check it out.
    We're storing an object of type Starter inside the starter variable.
    This means that starter will retain all of the information and methods that
    the starter class defines, but it will keep it's own, separate data.
    */

    System.out.println("Starter value: " + Integer.toString(starter.getValue()));
    /*
    Here's an example of printing out the starter's value, as defined in the
    Starter class.
    */

    Starter second = new Starter(3);
    /*
    Here, we've created a second instance of the Starter class, storing it in
    a variable we're calling "second." This Starter's data is completely
    independent of the first starter.
    */

    System.out.println("Second starter value: " +
      Integer.toString(second.getValue()));
    /*
    You'll notice that this value is different. Again, each Starter object's
    data is independent of another. This is critically useful in writing
    applications. 
    */
  }
}
