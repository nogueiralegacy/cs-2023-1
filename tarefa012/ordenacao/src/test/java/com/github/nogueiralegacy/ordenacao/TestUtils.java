package com.github.nogueiralegacy.ordenacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
class TestUtils {

    @Test
    void testMergeSortRecursivo() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};

        Ordena ordena = new MergeSortRecursivo();
        ordena.ordena(actual);
        assertArrayEquals(expected, actual);

    }

    @Test
    void testMergeSortIterativo() {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};

        Ordena ordena = new MergeSortIterativo();

        ordena.ordena(actual);
        assertArrayEquals(expected, actual);
    }
}