package com.pluralsight.java8.arrays.examples;

import java.util.Arrays;

/**
 * Example 7: Arrays are objects; beware that equals() and hashCode() don't do what you expect.
 */
public class Example07 {

    public static void main(String[] args) {
        int[] numbers1 = {16, 23, 30, 41};
        int[] numbers2 = {16, 23, 30, 41};

        // Arrays are objects so they inherit the methods of class java.lang.Object,
        // but note that equals() is not overridden for arrays, so it will only return true if both sides refer to
        // the same array object, and false if you have two separate objects, even though their elements are the same.
        System.out.println("Result of numbers1.equals(numbers1): " + numbers1.equals(numbers1));
        System.out.println("Result of numbers1.equals(numbers2): " + numbers1.equals(numbers2));

        // If you need to compare arrays by their elements, then use the utility method Arrays.equals() instead.
        System.out.println("Result of Arrays.equals(numbers1, numbers2): " + Arrays.equals(numbers1, numbers2));

        // Likewise, the hashcode of arrays is not based on the content of the arrays because this method is not
        // overridden, so arrays with equal elements may have different hashcodes.
        System.out.println("Hashcode of numbers1: " + numbers1.hashCode());
        System.out.println("Hashcode of numbers2: " + numbers2.hashCode());

        // There is a utility method that computes a hashcode based on the elements as well.
        System.out.println("Result of Arrays.hashCode(numbers1): " + Arrays.hashCode(numbers1));
        System.out.println("Result of Arrays.hashCode(numbers2): " + Arrays.hashCode(numbers2));
    }
}
