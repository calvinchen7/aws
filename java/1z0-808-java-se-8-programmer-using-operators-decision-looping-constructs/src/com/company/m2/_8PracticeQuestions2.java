package com.company.m2;

import java.util.Locale;

public class _8PracticeQuestions2 {
    public static void main(String[] args) {

        // assignment
        int a = 2; // does not compile if 2.0
        int b = (4 % 3) + 3;
        int c = ++a + b;
        System.out.println(c);

        // short-circuit
        int x = 5;
        boolean y = (2 < 1) || (x-- == 4);
        System.out.println(x);
        System.out.println(y);

        // string equality
        String d = "hi";
        String e = "HI".toLowerCase();
        System.out.println(d == e);
        System.out.println(d.equals(e));
    }
}
