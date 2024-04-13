package com.pluralsight.java8.arrays.examples;

/**
 * Example 8: Passing arrays to methods.
 */
public class Example08 {

    public static void main(String[] args) {
        int[] numbers = {16, 23, 30};

        // You can pass arrays to methods like any other variable.
        // Note that arrays are objects, so what really happens here is that a reference to the array is passed;
        // changes that the method makes to the array will be visible when the method has returned.
        addOne(numbers);
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();

        // You can pass an array directly, without creating a variable first.
        printSum(new int[]{16, 23, 30});

        // Note that in that case, you cannot use the short array initializer syntax; you must include: new int[]
//        printSum({16, 23, 30});
    }

    private static void addOne(int[] numbers) {
        // Note that we cannot use and enhanced for-loop here to modify the elements.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
    }

    private static void printSum(int[] numbers) {
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println(sum);
    }
}
