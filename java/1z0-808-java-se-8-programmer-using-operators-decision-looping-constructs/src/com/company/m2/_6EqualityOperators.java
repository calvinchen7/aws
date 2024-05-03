package com.company.m2;

public class _6EqualityOperators {

    public static void main(String[] args) {

        // comparing floating-point numbers is inaccurate
        double a = 1.000001;
        double b = 0.000001;

        System.out.println(a - b);
        System.out.println(a - b == 1.0);

        // comparing objects
        Car x = new Car("blue");
        Car y = new Car("blue");
        System.out.println(x == y); // false
        Car z = y;
        System.out.println(z == y); // true
    }

    static class Car {
        String color;
        Car(String color) {
            this.color = color;
        }
    }
}
