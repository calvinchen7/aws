package com.company.m2;

public class _5AssignmentOperators {

    public static void main(String[] args) {

        // won't compile without an explicit cast
        int b = (int) 2.0;
        int c = (int) 2f;
        int d = (int) 2d;

        int x = 4, y = 2;
//        x = x * y; // Simple
        x /= y;   // Compound
        // also +=, -= and /=
        System.out.println(x);
    }

    void example() {
        long x = 2;
        int y = 3;
//        y = y + x; // does not compile
        y += x;    // compiles
    }
}
