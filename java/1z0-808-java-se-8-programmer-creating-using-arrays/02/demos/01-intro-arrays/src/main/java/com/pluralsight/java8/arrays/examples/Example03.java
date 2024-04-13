package com.pluralsight.java8.arrays.examples;

/**
 * Example 3: Accessing array elements.
 */
public class Example03 {

    public static void main(String[] args) {
        String[] names = new String[4];

        // Access array elements by index.
        names[0] = "Susan";
        names[1] = "John";
        names[2] = "Betty";
        names[3] = "Mark";

        System.out.println("The first name is: " + names[0]);
        System.out.println("The second name is: " + names[1]);
        System.out.println("The third name is: " + names[2]);
        System.out.println("The fourth name is: " + names[3]);

        // When you use an invalid index, you'll get an ArrayIndexOutOfBoundsException when you run the program.
        // Valid indices are in the range: 0 upto and including length of the array - 1
        String name = names[4];

        // The index between the [ ] does not have to be a literal; you can use a variable as the index.
        int index = 2;
        String element = names[index];
        System.out.println("The element at index " + index + " is: " + element);
    }
}
