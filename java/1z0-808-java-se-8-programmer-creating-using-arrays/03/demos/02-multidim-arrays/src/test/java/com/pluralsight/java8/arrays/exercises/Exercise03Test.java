package com.pluralsight.java8.arrays.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise03Test {

    @Test
    @DisplayName("Exercise 3: Iterate over a multidimensional array and work with the elements")
    void fillWithNumbers() {
        int[][] numbers = {{0, 0}, {0, 0, 0}, {}, {0}};
        new Exercise03().fillWithNumbers(numbers);

        assertArrayEquals(new int[][]{{1, 2}, {3, 4, 5}, {}, {6}}, numbers, "The method did not do what was expected.");
    }
}
