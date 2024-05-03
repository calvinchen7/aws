package com.pluralsight.java8.arrays.examples;

import java.lang.reflect.Array;

/**
 * Example 7: Arrays and generics.
 */
public class Example07 {

    static <T> T[] createArray(int size) {
        // Error: generic array creation
//        return new T[size];
        return null;
    }

    // Generics exist only at compile time. A generic method like the one above is converted to something like the
    // following when it's compiled. Replacing the type parameters by non-generic types is called "type erasure".
    static Object[] createArray2(int size) {
        return new Object[size];
    }

    public static void main(String[] args) {
        // The type-erased version of this method returns an Object[], which is not a String[], so assigning the
        // return value to a String[] should cause a ClassCastException.
        String[] array = createArray(3);

        String[] array3 = createArray3(String.class, 3);
    }

    // It's possible to create a generic array by using reflection. You'll have to supply a Class<T> to provide the
    // necessary type information.
    @SuppressWarnings("unchecked")
    static <T> T[] createArray3(Class<T> cls, int size) {
        return (T[]) Array.newInstance(cls, size);
    }
}
