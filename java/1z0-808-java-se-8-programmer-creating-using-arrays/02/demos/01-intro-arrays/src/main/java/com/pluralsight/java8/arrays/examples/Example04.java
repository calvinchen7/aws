package com.pluralsight.java8.arrays.examples;

/**
 * Example 4: Iterating over an array.
 */
public class Example04 {

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8};

        // You can use a loop to iterate over the range of indices and work with the elements in the body of the loop.
        for (int i = 0; i < 4; i++) {
            int element = numbers[i];
            System.out.println("The element at index " + i + " is: " + element);
        }

        // Arrays have a special property: length
        System.out.println("The array contains " + numbers.length + " elements");
        for (int i = 0; i < numbers.length; i++) {
            int element = numbers[i];
            System.out.println("The element at index " + i + " is: " + element);
        }

        // Note: A frequent mistake is using the wrong loop bounds, for example <= length instead of < length
        // This will lead to an ArrayIndexOutOfBoundsException.
//        for (int i = 0; i <= numbers.length; i++) {
//            // ...
//        }

        // The length property is read-only. You cannot assign to it to change the length of the array.
//        numbers.length = 5;

        // Use the enhanced for-loop syntax if you don't need the index: this is shorter, simpler
        // and avoids errors such as the one mentioned above.
        int sum = 0;
        for (int element : numbers) {
            sum += element;
        }
        System.out.println("The sum is: " + sum);
    }
}
