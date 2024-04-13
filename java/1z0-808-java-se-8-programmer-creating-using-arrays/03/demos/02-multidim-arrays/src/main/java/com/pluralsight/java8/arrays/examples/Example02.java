package com.pluralsight.java8.arrays.examples;

/**
 * Example 2: Declaring and initializing multidimensional arrays.
 */
public class Example02 {

    public static void main(String[] args) {
        // You can use values between curly brackets to initialize an array.
        // Since the elements of the array are arrays, you just recursively use the same syntax for the next level.
        float[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // The above is really just short syntax of the following.
        float[][] matrix2 = new float[][]{new float[]{1, 2, 3}, new float[]{4, 5, 6}, new float[]{7, 8, 9}};

        // It also works for multidimensional arrays with more than two dimensions.
        // Just nest the syntax multiple levels.
        float[][][] values = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };

        // Not all member arrays have to have the same length.
        float[][] triangle = {{3}, {6, 7}, {2, 4, 8}, {9, 5, 1, 3}, {0, 4, 6, 5, 8}};

        // Note the difference between an empty array and null; similar to an empty string and null.
        String[][] text = {{"Hello", "World"}, {}, null};

        // Recall this line from the previous example:
        float[][] matrix3 = new float[3][3];

        // This is the same as this:
        float[][] matrix4 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        // Recall this line, where we initialized only the first dimension:
        float[][] matrix5 = new float[3][];

        // This is the same as this:
        float[][] matrix6 = {null, null, null};
    }
}
