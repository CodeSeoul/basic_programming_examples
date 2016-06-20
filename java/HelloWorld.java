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

public class HelloWorld {

  // This is the function that runs when you run this class as the main program. Don't worry about how or why quite yet. Just know it does the thing.
  public static void main(String[] args) {
      // This will print out Hello World to your command line. System is a variable that Java exposes to you. In object-oriented land, something like System can have other data inside it, in this case out. Out represents the data stream that prints to stdout, which is your command line. Println is a function that prints a line of text.
      // Using this line is a good way to print out information to help you determine how your application is behaving.
      System.out.println("Hello world!");
  }

}
