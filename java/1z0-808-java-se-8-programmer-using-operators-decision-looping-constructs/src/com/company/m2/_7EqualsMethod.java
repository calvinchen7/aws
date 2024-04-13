package com.company.m2;

public class _7EqualsMethod {


    public static void main(String[] args) {

        String a = "abc";
        String b = new String("abc");
        String c = new String("abc");
        String d = new String(" abc").trim();

        System.out.println(a == b);
        System.out.println(a == d);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
    }
}
