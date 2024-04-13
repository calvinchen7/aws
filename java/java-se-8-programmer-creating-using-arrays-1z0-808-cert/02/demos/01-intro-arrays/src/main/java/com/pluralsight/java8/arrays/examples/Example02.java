package com.pluralsight.java8.arrays.examples;

/**
 * Example 2: Declaring and initializing arrays.
 */
public class Example02 {

    public static void main(String[] args) {
        // Create a new array with 4 elements, initialized to the default value 0.
        int[] numbers1 = new int[4];

        // You can create an array with elements of any Java type.
        String[] names = new String[3];

        // Note that this will not create 10 Person objects. The elements of this array are initialized to null.
        Person[] people = new Person[10];

        // Create a new array and initialize it with the given numbers.
        // Note: The size of the array is determined by the number of values between the { }
        int[] numbers2 = new int[]{2, 4, 6, 8};

        // Shorter syntax: You can leave out the new int[]
        int[] numbers3 = {2, 4, 6, 8};

        // The size of an array can be zero.
        int[] empty1 = new int[0];

        // Another way to create a zero-length array.
        int[] empty2 = {};
    }
}
