package org.l2csl.java.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by thebeege on 11/18/16.
 */
public class Main {
    public static void main(String[] args) {
        int fibResult = fibonacci(10);
        System.out.println("fibResult: " + fibResult);


        // TODO: Tower of Hanoi - Solve it! See the hanoi function

        List<Integer> rodA = Arrays.asList(3, 2, 1);
        List<Integer> rodB = new ArrayList<>();
        List<Integer> rodC = new ArrayList<>();
        hanoi(3, rodA, rodB, rodC);
    }

    // Here's an example to get you started
    public static int fibonacci(int n) {
        if( n <= 1) {
            return n;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }

    public static int hanoi(int count, List<Integer> startRod, List<Integer> workingRod, List<Integer> endRod) {
        /*
         It consists of three rods, and a number of disks of different sizes which can slide onto any rod. The puzzle starts with the disks in a neat stack in ascending order of size on one rod, the smallest at the top, thus making a conical shape.
        The objective of the puzzle is to move the entire stack to another rod, obeying the following simple rules:
        1) Only one disk can be moved at a time.
        2) Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack i.e. a disk can only be moved if it is the uppermost disk on a stack.
        3) No disk may be placed on top of a smaller disk.
        With three disks, the puzzle can be solved in seven moves. The minimum number of moves required to solve a Tower of Hanoi puzzle is 2n - 1, where n is the number of disks.
         */

        // Make sure to keep some output of the work. Make sure this at the end of your work step:
        System.out.println("startRod: " + startRod.toString());
        System.out.println("workingRod: " + workingRod.toString());
        System.out.println("endRod: " + endRod.toString());
    }

    public static int greatestCommonDivisor(int a, int b) {
        // TODO: Find and return the greatest common divisor between the two numbers
    }

    /*
        TODO: CHALLENGE: Binary Search. Given an List, start at the middle of the list and keep splitting it
          in half until you find the desired value.
     */
}
