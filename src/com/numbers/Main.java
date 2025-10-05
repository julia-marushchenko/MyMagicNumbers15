// Java program to find numbers dividable by 3

package com.numbers;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating array of integers
        int [] arr = new int[18];

        // Filling array with numbers
        for (int index = 0; index < 18; index++) {
            arr [index] = index;
        }

        // Checking numbers
        for (int index = 0; index < 18; index++) {

            // Condition
            if(arr [index] % 3 == 0) {

                // Printing result to console
                System.out.println(arr [index] + " can be divided by 3.");
            } else {

                // Printing result to console
                System.out.println(arr [index] + " can not be divided by 3.");
            }
        }
    }
}