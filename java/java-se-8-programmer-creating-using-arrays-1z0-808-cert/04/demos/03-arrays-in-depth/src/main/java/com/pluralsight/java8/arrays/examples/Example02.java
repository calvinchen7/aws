package com.pluralsight.java8.arrays.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example 2: Converting an array to a List.
 */
public class Example02 {

    public static void main(String[] args) {
        // We can use Arrays.asList() to convert an array into a List.
        String[] array = {"one", "two", "three"};
        List<String> list = Arrays.asList(array);

        // Arrays.asList() is a varargs method. This is a convenient way to create a List.
        List<String> list2 = Arrays.asList("one", "two", "three");

        // The list that Arrays.asList() returns is backed by the array.
        // This means that if you change elements in the list, you'll see those changes in the array as well.
        list.set(0, "four");
        System.out.println(Arrays.toString(array)); // Prints: [four, two, three]

        // And if you change elements in the array, you'll also see those changes in the list.
        array[0] = "five";
        System.out.println(list); // Prints: [five, two, three]

        // The List has some restrictions. Arrays cannot be resized, therefore you cannot add or remove elements
        // to and from the List. If you try, you'll get an UnsupportedOperationException.
//        list.add("six");

        // If you want a List that is independent of the array, then create a new ArrayList, passing it the result
        // of Arrays.asList() as the argument.
        List<String> list3 = new ArrayList<>(Arrays.asList(array));

        // Adding elements to or removing elements from that list works, and does not change the array.
        list3.add("six");
        System.out.println(Arrays.toString(array)); // Prints: [five, two, three]
        System.out.println(list3); // Prints: [five, two, three, six]

        // Note: Creating a List from an array in this way does not copy or clone the elements.
    }
}
