package com.pluralsight.java8.arrays.exercises;

/**
 * Exercise 1: Write a varargs method.
 */
public class Exercise01 {

    // TODO: Write a method named 'concat' that takes two parameters: a String, and a varargs parameter of the type Object.
    // The return type of the method should be: String.
    //
    // This is what the method should do: Concatenate the varargs values into a String, with the first String as a
    // separator. Examples of expected results:
    //
    // concat(";", "a", "b", "c") => "a;b;c"
    // concat("##", "hello", "world") => "hello##world"
    // concat("@") => "" (empty string, no varargs values supplied)
    // concat("@", "X") => "X"
    //
    // Hints:
    // - Use a StringBuilder to build the string.
    // - Call 'toString()' on each of the varargs values to convert them to strings.
    // - Take special care of the cases when the method is called with zero or one varargs values.
}
