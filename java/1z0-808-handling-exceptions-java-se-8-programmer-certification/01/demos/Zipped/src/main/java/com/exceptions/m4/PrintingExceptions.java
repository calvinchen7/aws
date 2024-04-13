package com.exceptions.m4;

public class PrintingExceptions {

    public static void main(String[] args) {
        try {
            throw new RuntimeException("oops!");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
