package com.exceptions.m3;

import java.io.IOException;

public class CheckedVsUnchecked {

    public static void main(String[] args) {
        doThis();
//        doThat();
        System.out.println("This will not run");
    }

    private static void doThat() throws IOException {
        throw new IOException();
    }

    private static void doThis() throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}
