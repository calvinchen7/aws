package com.pluralsight.java8.arrays.examples;

import java.util.Scanner;

/**
 * Example 5: Entering multiple numbers and computing the sum using an array.
 */
public class Example05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int count = Integer.parseInt(scanner.nextLine());

        // Create an array to store "count" numbers
        int[] numbers = new int[count];

        // Let the user enter the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        // Note that this does not work! The loop variable "element" is separate variable with a copy of the value of
        // the actual array element. Assigning to the variable "element" will not change the element in the array.
//        for (int element : numbers) {
//            System.out.print("Enter a number: ");
//            element = Integer.parseInt(scanner.nextLine());
//        }

        // Compute the sum and print it
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }
}
