package com.github.nogueiralegacy.ordenacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestUtils {

    @Test
    void testMergeSortRecursivo() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };

        Utils util = new Utils();

        util.mergeSortRecursivo(actual, actual.length);
        assertArrayEquals(expected, actual);

    }
}
