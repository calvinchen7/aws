package com.pluralsight.java8.arrays.examples;

/**
 * Example 1: Declaring and initializing multidimensional arrays.
 */
public class Example01 {

    public static void main(String[] args) {
        // Declare a variable 'matrix' which is an array of arrays of floats,
        // and initialize it so that each level has three elements.
        float[][] matrix = new float[3][3];

        // Here, we initialize only the first level: matrix2 will contain three null values.
        float[][] matrix2 = new float[3][];

        // To fully initialize it, we have to create the arrays that are the elements of the array matrix2
        // ourselves in a loop. Note that "new float[3][3]" is really a shorthand for this.
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new float[3];
        }

        // Not all elements of the array 'triangle' have to have the same length.
        float[][] triangle = new float[10][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new float[i + 1];
        }

        // You can have more than two dimensions, and decide to initialize only part of the dimensions.
        String[][][][] data = new String[3][2][][];

        // Remember the alternative syntax for declaring array variables, where the square brackets are placed after
        // the variable name. This can be used for multidimensional arrays as well.
        int a[][]; // The same as int[][] a;

        // You can even mix putting square brackets after the type and after the variable name,
        // but this quickly becomes confusing.
        int[] b[]; // The same as int[][] b;

        // Quote from the Java Language Specification for Java SE 8, paragraph 10.2
        // https://docs.oracle.com/javase/specs/jls/se8/html/jls-10.html#jls-10.2
        float[][] f[][], g[][][], h[];  // Yechh!
    }
}
