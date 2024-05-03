package com.company.m2;

public class _2ArithmeticOperators {

    public static void main(String[] args) {

        // simple - left to right
        int x = 2 * 2 + 3 - 1;
        System.out.println(x);

        // complex - operator precedence
        int y = 2 * 3 + 4 / 2 - 1;
        System.out.println(y);

        // complex - parentheses
        int z = 2 * 3 + 4 / (2 - 1);

        System.out.println(z);

        // complex - nested parentheses
        int a = 2 * (3 + 4 / (2 - 1));

        System.out.println(a);
    }
}
