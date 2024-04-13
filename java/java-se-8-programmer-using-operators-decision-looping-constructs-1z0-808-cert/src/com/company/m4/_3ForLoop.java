package com.company.m4;

public class _3ForLoop {

    public static void main(String[] args) {
        // simple example
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        // complex example
        for(int x = 10; x >= 8; --x) {
            System.out.print(x + " ");
        }

        System.out.println("");
        // complex example 2
        for(int x = 10; x >= 2; x=x-3) {
            System.out.print(x + " ");
        }

        // multiple statements
        System.out.println("\nMultiple statements");
        for(long x = 1, y = 13; x < 2 || y > 10; x++, y--) {
            System.out.println(x + "-" + y);
        }
    }
}
