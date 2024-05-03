package com.company.m2;

public class _4PracticeQuestions1 {
    public static void main(String[] args) {

        // Question 1
        int i = 9 % 3 * (2 + 1);
        System.out.println(i);

        // Question 2
        byte a = 10;
        // fails to compile if 'b' is byte instead of int
        int b = a * 20 % 4 + 5;
        System.out.println(a + b);

        // Question 3
        int x = 10;
        double y = 2;
        double z = x++ + --y;

        System.out.println(z);
    }
}
