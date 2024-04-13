package com.pluralsight.java8.arrays.exercises;

import com.pluralsight.java8.arrays.exercises.Exercise05.Box;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercise05Test {

    @Test
    @DisplayName("Exercise 5: Copying arrays - shallow copy")
    void shallowCopy() {
        Box[] input = {new Box(3), new Box(2), new Box(1)};
        Box[] result = new Exercise05().shallowCopy(input);

        assertArrayEquals(input, new Box[]{new Box(3), new Box(2), new Box(1)}, "The method modified its arguments.");
        assertArrayEquals(result, input, "The method did not return the expected result.");

        assertNotSame(input, result, "The method did not copy its input, it returned the input itself.");
        assertSame(input[0], result[0], "The method did not make a shallow copy.");
        assertSame(input[1], result[1], "The method did not make a shallow copy.");
        assertSame(input[2], result[2], "The method did not make a shallow copy.");
    }

    @Test
    @DisplayName("Exercise 5: Copying arrays - deep copy")
    void deepCopy() {
        Box[][] input = {{new Box(2), new Box(3)}, {}, {new Box(1), new Box(4), new Box(5)}};
        Box[][] result = new Exercise05().deepCopy(input);

        assertArrayEquals(input, new Box[][]{{new Box(2), new Box(3)}, {}, {new Box(1), new Box(4), new Box(5)}}, "The method modified its arguments.");
        assertArrayEquals(result, input, "The method did not return the expected result.");

        assertNotSame(input, result, "The method did not copy its input, it returned the input itself.");
        assertNotSame(input[0], result[0], "The input did not make a deep copy. One of its element arrays was not copied.");
        assertNotSame(input[1], result[1], "The input did not make a deep copy. One of its element arrays was not copied.");
        assertNotSame(input[2], result[2], "The input did not make a deep copy. One of its element arrays was not copied.");
        assertNotSame(input[0][0], result[0][0], "The input did not make a deep copy. One of its Box objects was not copied.");
        assertNotSame(input[0][1], result[0][1], "The input did not make a deep copy. One of its Box objects was not copied.");
        assertNotSame(input[2][0], result[2][0], "The input did not make a deep copy. One of its Box objects was not copied.");
        assertNotSame(input[2][1], result[2][1], "The input did not make a deep copy. One of its Box objects was not copied.");
        assertNotSame(input[2][2], result[2][2], "The input did not make a deep copy. One of its Box objects was not copied.");
    }
}
