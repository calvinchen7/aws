package com.pluralsight.java8.arrays.examples;

import java.util.Arrays;

/**
 * Example 5: Utility methods for working with multidimensional arrays.
 */
public class Example05 {

    public static void main(String[] args) {
        String[] words = {"Hello", "World"};

        // Calling toString() on an array does not produce the result you might expect.
        System.out.println(words.toString());

        // There's a utility method Arrays.toString(...) that gives a more sensible result.
        System.out.println(Arrays.toString(words));

        // However, this does not work on a multidimensional array, because Arrays.toString(...)
        // just calls toString() on the elements of the array.
        String[][] sentences = {{"Hello", "World"}, {"How", "are", "you"}};
        System.out.println(Arrays.toString(sentences));

        // For multidimensional arrays, use Arrays.deepToString() which recursively calls itself
        // on the elements, if the elements are arrays.
        System.out.println(Arrays.deepToString(sentences));

        // Similarly, there are deepEquals() and deepHashCode() utility methods.
        String[][] sentences2 = {{"Hello", "World"}, {"How", "are", "you"}};
        System.out.println(Arrays.equals(sentences, sentences2)); // false
        System.out.println(Arrays.deepEquals(sentences, sentences2)); // true
    }
}
