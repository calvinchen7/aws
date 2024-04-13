package com.pluralsight.java8.arrays.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise01Test {

    @Test
    @DisplayName("Exercise 1: Create and initialize a multidimensional array")
    void createMultidimensionalArray() {
        String[][] result = new Exercise01().createMultidimensionalArray();

        assertNotNull(result, "The method returned 'null'.");
        assertEquals(3, result.length, "The top-level array that the method returned was the wrong length.");
        assertEquals(2, result[0].length, "The first second-level array that the method returned was the wrong length.");
        assertEquals(2, result[1].length, "The second second-level array that the method returned was the wrong length.");
        assertEquals(2, result[2].length, "The third second-level array that the method returned was the wrong length.");
        assertArrayEquals(new String[][]{{"Hello", "World"}, {null, null}, {null, null}}, result, "The array that the method returned did not contain the expected elements.");
    }
}
