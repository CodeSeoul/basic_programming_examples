package org.l2csl.classes;

/**
 * Created by draco on 10/22/2016.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle myVehicle = new Vehicle(3, 100, "red");
        myVehicle.drive();

        Vehicle otherVehicle = new Vehicle(4, 120, "blue");
        otherVehicle.drive();

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
