package org.l2csl.classes;

/*
  This is how we define our own class, just like we've been doing.
  What's a class? You can think of a class like a blueprint. It defines
  how something in your code should behave. You can "instantiate" a class
  by creating an object. You can think of an object like the building itself
  made from the blueprint.
*/
public class Vehicle {
    /*
      These variables are called "properties." Anytime you create an object
      from this class, that object will have these variables.
    */
    private int numWheels, speed, wheelChanges;
    protected String color;

    /*
      What are private and protected? These are access modifiers. When a
      property or method is private, that means no other class can access
      it. If there's no modifier, any class in the same package can access it.
      When a property or method is protected, that means only classes
      in the same package and subclasses can access it.  When a property or
      method is public, any class anywhere can access it.
      https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
    */

    /*
      This is a constructor. It ties in well with our blueprint and building
      metaphor. This method is what you call to create an object instance of
      this class. You can see this in HelloWorld.java
    */
    public Vehicle(int numWheels, int speed, String color) {
        this.numWheels = numWheels;
        this.speed = speed;
        this.color = color;
    }

    /*
      You'll notice that this is a second constructor but with different
      parameters. This is called "overloading." This allows you to create
      methods with the same name that take in differen parameters and have
      different behaviors.
      In this case, if a color isn't provided, we're setting it to black,
      effectively making it a default value.
    */
    public Vehicle(int numWheels, int speed) {
        this.numWheels = numWheels;
        this.speed = speed;
        this.color = "black";
    }

    /*
      This is an example of a method, just like we've done in the past.
    */
    public void drive() {
        System.out.println("I'm driving with " +
                numWheels + " wheels!");
    }

    /*
      This is a common type of method called a "getter." This is useful
      if you want a property to be read-only. Set the property to private,
      then provide a getter so that other objects can retrieve the value.
      This prevents other objects from modifying it.
    */
    public int getNumWheels() {
        return this.numWheels;
    }

    /*
      This another common type of method called a "setter." This is useful
      if you want to ensure additional operations happen when changing
      a property. 
    */
    public void setNumWheels(int numWheels) {
        wheelChanges++;
        this.numWheels = numWheels;
        System.out.println("Wheels have been changed " +
            wheelChanges + " times!");
    }
}
