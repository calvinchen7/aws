package com.pluralsight.java8.arrays.exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Exercise02Test {

    @Test
    @DisplayName("Convert an array to a List")
    void arrayToList() {
        String[] array = {"a", "b", "c"};

        List<String> result = new Exercise02().arrayToList(array);
        assertEquals(Arrays.asList("a", "b", "c"), result);

        array[0] = "x";
        assertEquals(Arrays.asList("a", "b", "c"), result, "The method did not return a list that is independent of the input array.");
    }
}
