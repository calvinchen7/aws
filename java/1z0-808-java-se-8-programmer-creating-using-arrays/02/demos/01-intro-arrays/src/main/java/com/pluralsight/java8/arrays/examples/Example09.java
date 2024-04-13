package com.pluralsight.java8.arrays.examples;

import java.util.Arrays;

/**
 * Example 9: Utility methods for working with arrays.
 */
public class Example09 {

    public static void main(String[] args) {
        int[] numbers1 = {16, 23, 30};

        // Arrays.copyOf() creates a copy of an array, but the new array
        // may have a length shorter or longer than the original array.
        int[] numbers2 = Arrays.copyOf(numbers1, 4);

        // The toString() method of the automatically generated array classes is not overridden, so when you try to
        // print an array directly like this, you'll get a strange result.
        System.out.println(numbers2);

        // Class Arrays contains a toString() method that is much more useful.
        System.out.println(Arrays.toString(numbers2));

        // Arrays.copyOfRange() creates a copy of part of an array.
        // Note that the from index is inclusive and the end index is exclusive.
        int[] numbers3 = Arrays.copyOfRange(numbers2, 1, 3);
        System.out.println(Arrays.toString(numbers3));

        // System.arraycopy() copies (part of) the elements of one array into another array.
        // Here we use it to create a new array numbers4 with all the elements of the arrays numbers2 and numbers3
        int[] numbers4 = new int[6];
        System.arraycopy(numbers2, 0, numbers4, 0, 4);
        System.arraycopy(numbers3, 0, numbers4, 4, 2);
        System.out.println(Arrays.toString(numbers4));

        // Arrays.sort() sorts the elements of an array.
        Arrays.sort(numbers4);
        System.out.println(Arrays.toString(numbers4));

        // Arrays.binarySearch() searches for a specific element.
        // Note that the array must be sorted, otherwise the result is undefined!
        int index = Arrays.binarySearch(numbers4, 23);
        System.out.println("Found value 23 at index: " + index);
    }
}
