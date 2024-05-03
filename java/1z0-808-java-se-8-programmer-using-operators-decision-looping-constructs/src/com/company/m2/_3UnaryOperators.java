package com.company.m2;

public class _3UnaryOperators {

    public static void main(String[] args) {

        // example one
        int x = 5;
        double y = 2 + 2 * x--;
        System.out.println(y);
        System.out.println(x);

        // example two
        int a = 5;
        double b = 2 + 2 * --a;
        System.out.println(b);
        System.out.println(a);
    }
}
