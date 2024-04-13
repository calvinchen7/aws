package com.pluralsight.java8.arrays.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    @DisplayName("Exercise 2: Create and partially initialize a multidimensional array")
    void createPartialMultidimensionalArray() {
        int[][][] result = new Exercise02().createPartialMultidimensionalArray();

        assertNotNull(result, "The method returned 'null'.");
        assertEquals(2, result.length, "The top-level array that the method returned was the wrong length.");
        assertEquals(3, result[0].length, "The first second-level array that the method returned was the wrong length.");
        assertEquals(3, result[1].length, "The second second-level array that the method returned was the wrong length.");
        assertArrayEquals(new int[][][]{{null, null, null}, {{2, 4, 6, 8}, null, null}}, result, "The array that the method returned did not contain the expected elements.");
    }
}
