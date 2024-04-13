package com.exceptions.m4.overriding;

import java.io.IOException;

public abstract class TeamMember {

    // can add a checked exception without breaking
    public void work() throws IOException  {
        System.out.println("TeamMember");
    }
}
