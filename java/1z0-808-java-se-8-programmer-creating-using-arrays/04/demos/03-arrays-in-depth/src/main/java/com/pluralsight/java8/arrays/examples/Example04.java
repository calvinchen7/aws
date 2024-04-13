package com.pluralsight.java8.arrays.examples;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example 4: Converting an array to and from a Set.
 */
public class Example04 {

    public static void main(String[] args) {
        String[] array = {"one", "two", "three", "two"};

        // There is no Arrays.asSet() or toSet() method, but Set implementations such as HashSet and TreeSet
        // have a constructor that can take a collection as a parameter.
        Set<String> set = new TreeSet<>(Arrays.asList(array));

        // Note that a Set cannot contain duplicate elements.
        System.out.println(set); // Prints: [one, three, two]

        // Converting a Set to an array works in the same way as converting a List to an array.
        String[] array2 = set.toArray(new String[0]);
        System.out.println(Arrays.toString(array2));
    }
}
