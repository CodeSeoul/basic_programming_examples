package org.l2csl.classes;
/*
  Hey, why all the folders????
  This is the start of packages. Packages are ways of organizing code.
  If you look at the Java standard library, it is split into many packages,
  allowing for more controlled access and a good way to keep track of things.
*/

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle myVehicle = new Vehicle(3, 100, "red");
        /*
          This is an example of creating an object. In another file, we defined
          the Vehicle class. Just like ArrayLists or HashMaps, we can create
          a unique instance of this class, calling it an object.
          The keyword "new" is important and only used when creating objects.
          It tells Java to call the class's constructor and to produce a new
          object.
        */
        myVehicle.drive();
        // This is how you call a method from an object

        Vehicle otherVehicle = new Vehicle(4, 120, "blue");
        otherVehicle.drive();
        /*
          You'll notice that these values are different from those above.
          Each object has its own copy of its data. This concept is called
          encapsulation - the data is encapsulated in the object.
          Changing any values on myVehicle will have no effect on otherVehicle.
        */

        Vehicle anotherVehicle = new Vehicle(2, 140);
        System.out.println("another vehicle has " +
                anotherVehicle.getNumWheels() + " wheels");
        anotherVehicle.setNumWheels(5);
        anotherVehicle.setNumWheels(2);
        anotherVehicle.drive();

        Car myCar = new Car(80, "gray");
        myCar.drive();
    }
}
