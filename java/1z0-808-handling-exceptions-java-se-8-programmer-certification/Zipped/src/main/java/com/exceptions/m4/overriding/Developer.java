package com.exceptions.m4.overriding;

public class Developer extends TeamMember {

    // CANNOT add a checked exception without breaking
    @Override
    public void work() {
        System.out.println("Dev");
    }
}
