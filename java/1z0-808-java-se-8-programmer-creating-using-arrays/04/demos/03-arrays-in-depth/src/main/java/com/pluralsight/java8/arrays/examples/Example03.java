package com.pluralsight.java8.arrays.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example 3: Converting a List to an array.
 */
public class Example03 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        // You can call toArray() on a List. This will give you an Object[].
        Object[] array = list.toArray();

        // Even though you know that this array only contains String objects, you cannot cast it to a String[].
        // This will cause a ClassCastException.
//        String[] strings = (String[]) array;

        // If you want a String[], then you need to pass an array of the right type to toArray().
        // Note that the array that you pass is only needed for the type information. The toArray() method will
        // create a new array itself, it does not fill the array that you pass to it.
        String[] array2 = list.toArray(new String[0]);

        // Note that the array returned by toArray() method is independent of the original List.
        // This is different from the list returned by Arrays.asList().
        list.add("four");
        array2[0] = "five";

        System.out.println(list); // Prints: [one, two, three, four]
        System.out.println(Arrays.toString(array2)); // Prints: [five, two, three]

        // Note: Creating an array from a List in this way does not copy or clone the elements.
    }
}
