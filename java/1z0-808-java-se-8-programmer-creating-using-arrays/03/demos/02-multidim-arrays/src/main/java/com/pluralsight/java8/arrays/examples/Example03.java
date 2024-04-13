package com.pluralsight.java8.arrays.examples;

/**
 * Example 3: Accessing multidimensional array elements.
 */
public class Example03 {

    public static void main(String[] args) {
        float[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Use multiple sets of square brackets to access multidimensional array elements.
        System.out.println("Element [1][2] is: " + matrix[1][2]);

        // The way to think about this: It is a nested set of array element access expressions.
        // Whatever is in front of a pair of square brackets with an index, must evaluate to an array.
        float[] secondRow = matrix[1];
        float element = secondRow[2]; // The same as matrix[1][2];

        // Since not every element array has to have the same length, you have to be careful when accessing
        // elements at a deeper level.
        float[][] triangle = {{3}, {6, 7}, {2, 4, 8}, {9, 5, 1, 3}, {0, 4, 6, 5, 8}};
        float value = triangle[1][1]; // OK
//        float value = triangle[0][1]; // ArrayIndexOutOfBoundsException, triangle[0] has only one element

        String[][] text = {{"Hello", "World"}, {}, null};
//        String s1 = text[1][0]; // ArrayIndexOutOfBoundsException, text[1] has zero elements
//        String s2 = text[2][0]; // NullPointerException, text[2] is null
    }
}
