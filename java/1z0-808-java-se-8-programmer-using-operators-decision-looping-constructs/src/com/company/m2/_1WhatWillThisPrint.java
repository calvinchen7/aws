package com.company.m2;

public class _1WhatWillThisPrint {

    public static void main(String[] args) {

        // example one
        int x = 5;
        double y = 2 + 2 * x--;
        System.out.println(y);

        // example two (infinite loop)
        int a = 1;
        int b = 2;
        while(a < 3) {
            b++;
        }
    }
}
