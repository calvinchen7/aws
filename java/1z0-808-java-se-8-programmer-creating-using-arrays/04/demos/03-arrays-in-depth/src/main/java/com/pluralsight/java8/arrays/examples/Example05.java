package com.pluralsight.java8.arrays.examples;

/**
 * Example 5: Understanding arrays and subtyping.
 */
public class Example05 {

    public static void main(String[] args) {
        // You can assign a String to a variable of type Object, because String is a subtype of Object.
        Object name = "Pluralsight";

        // However, you cannot call methods of class String via the variable 'name', because the compiler looks
        // at the type of the variable and not the type of the actual object to determine which methods are available.
//        System.out.println(name.toUpperCase());

        // To be able to call String methods, we first have to cast the variable to the type String.
        String str = (String) name;
        System.out.println(str.toUpperCase());

        // When you cast, a check is done at runtime to make sure that the object you are casting is an instance of
        // the target type. If it isn't, a ClassCastException will occur.
        Object obj = new Object();
//        String str2 = (String) obj;

        // This array is an instance of the type: Object[] (object array).
        Object[] array = new Object[]{"one", "two", "three"};

        // The type "object array" is different from the type "string array", just like the type Object is different
        // from the type String. Therefore, we cannot cast an object of type "object array" to the type "string array".
//        String[] strings = (String[]) array;
    }
}
