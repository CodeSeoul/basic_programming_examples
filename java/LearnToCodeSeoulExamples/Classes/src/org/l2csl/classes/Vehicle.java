package org.l2csl.classes;

/**
 * Created by draco on 10/22/2016.
 */
public class Vehicle {
    private int numWheels, speed, wheelChanges;
    protected String color;

    /* This is a construct ... */
    public Vehicle(int numWheels, int speed, String color) {
        this.numWheels = numWheels;
        this.speed = speed;
        this.color = color;
    }

    public Vehicle(int numWheels, int speed) {
        this.numWheels = numWheels;
        this.speed = speed;
        this.color = "black";
    }

    public void drive() {
        System.out.println("I'm driving with " +
                numWheels + " wheels!");
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        wheelChanges++;
        this.numWheels = numWheels;
        System.out.println("Wheels have been changed " +
            wheelChanges + " times!");
    }
}
