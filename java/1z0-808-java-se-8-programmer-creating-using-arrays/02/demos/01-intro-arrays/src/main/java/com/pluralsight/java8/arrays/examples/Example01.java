package com.pluralsight.java8.arrays.examples;

import java.util.Scanner;

/**
 * Example 1: Entering multiple numbers, declaring a separate variable for each number.
 */
public class Example01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter another number: ");
        int a2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter a third number: ");
        int a3 = Integer.parseInt(scanner.nextLine());

        int sum = a1 + a2 + a3;
        System.out.println("The sum is: " + sum);
    }
}
