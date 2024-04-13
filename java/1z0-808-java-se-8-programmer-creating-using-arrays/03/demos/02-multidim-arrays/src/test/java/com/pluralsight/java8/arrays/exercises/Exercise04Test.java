package com.pluralsight.java8.arrays.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise04Test {

    @Test
    @DisplayName("Exercise 4: Use a utility method to check for equality")
    void checkEqual() {
        String[][] array1 = {{"one", "two"}, {}, {"three", "four", "five"}, null};
        String[][] array2 = {{"one", "two"}, {}, {"three", "four", "five"}, null};
        String[][] array3 = {{"three", "four", "five"}, {"one", "two"}};

        assertTrue(new Exercise04().checkEqual(array1, array2), "The method returned the wrong result.");
        assertTrue(new Exercise04().checkEqual(array2, array1), "The method returned the wrong result.");
        assertFalse(new Exercise04().checkEqual(array1, array3), "The method returned the wrong result.");

        assertArrayEquals(array1, new String[][]{{"one", "two"}, {}, {"three", "four", "five"}, null}, "The method modified one of its arguments.");
        assertArrayEquals(array2, new String[][]{{"one", "two"}, {}, {"three", "four", "five"}, null}, "The method modified one of its arguments.");
        assertArrayEquals(array3, new String[][]{{"three", "four", "five"}, {"one", "two"}}, "The method modified one of its arguments.");
    }
}
