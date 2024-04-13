package com.pluralsight.java8.arrays.examples;

/**
 * Example 4: Iterating over a multidimensional array.
 */
public class Example04 {

    public static void main(String[] args) {
        float[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Iterate over the elements with nested loops.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Exactly the same, without hard-coded row and column lengths:
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Exactly the same, written with enhanced for-loops:
        for (float[] row : matrix) {
            for (float element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
