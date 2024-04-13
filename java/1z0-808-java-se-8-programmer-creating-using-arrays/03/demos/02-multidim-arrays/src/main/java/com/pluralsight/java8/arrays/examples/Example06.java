package com.pluralsight.java8.arrays.examples;

import java.util.Arrays;

/**
 * Example 6: Copying arrays.
 */
public class Example06 {

    public static void main(String[] args) {
        int[][] numbers1 = {{1, 2, 3}, {4, 5}};

        // You can clone an array; this will create a shallow copy.
        int[][] numbers2 = numbers1.clone();

        // Comparing them with == shows that we have to different array objects.
        System.out.println("Are numbers1 and numbers2 the same object? " + (numbers1 == numbers2));

        // But the elements are the same objects; by cloning numbers1, its elements were not cloned.
        System.out.println("Are numbers1[0] and numbers2[0] the same object? " + (numbers1[0] == numbers2[0]));
        System.out.println("Are numbers1[1] and numbers2[1] the same object? " + (numbers1[1] == numbers2[1]));

        // If you modify an element in numbers2, you will see the change in numbers1 as well,
        // because numbers1 and numbers2 share the same element arrays.
        numbers2[0][1] = 7;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers2));

        // Likewise, Arrays.copyOf(...) (and also Arrays.copyOfRange(...)) create a shallow copy.
        int[][] numbers3 = Arrays.copyOf(numbers1, numbers1.length);

        // Proof that Arrays.copyOf(...) creates a shallow copy.
        numbers3[0][1] = 8;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers3));

        // Also, System.arraycopy(...) only does a shallow copy.
        int[][] numbers4 = new int[2][];
        System.arraycopy(numbers1, 0, numbers4, 0, 2);

        // Proof that Arrays.copyOf(...) creates a shallow copy.
        numbers4[0][1] = 9;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers4));

        // There is no easy way to create a deep copy. One way to do it is with nested loops.
        int[][] numbers5 = new int[numbers1.length][];
        for (int i = 0; i < numbers1.length; i++) {
            numbers5[i] = new int[numbers1[i].length];
            for (int j = 0; j < numbers1[i].length; j++) {
                numbers5[i][j] = numbers1[i][j];
            }
        }

        // We have successfully created a deep copy of numbers1.
        numbers5[0][1] = 10;
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println(Arrays.deepToString(numbers5));
    }
}
