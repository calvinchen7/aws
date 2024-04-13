package com.pluralsight.java8.arrays.examples;

import java.time.LocalDate;

/**
 * Example 1: Working with variable arguments (varargs).
 */
public class Example01 {

    public static void main(String[] args) {
        // Sometimes it's useful to be able to define a method with a variable number of arguments.
        // For example, String.format() is such a method.
        String text = String.format("Hello %s, today is %s", "World", LocalDate.now().getDayOfWeek());
        System.out.println(text);

        // We can declare our own method with a variable number of arguments (see below) and call it.
        int result = sum(2, 5, 4, 8);
        System.out.println(result);

        // When you call a varargs method with an array, it's passed directly as if the method takes
        // the array as a parameter.
        int[] numbers = {2, 5, 4, 8};
        int result2 = sum(numbers);
        System.out.println(result2);
    }

    // You can declare a method with a variable number of arguments using "..."
    // Inside the method, the parameter is an array, so numbers is an int[]
    private static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
