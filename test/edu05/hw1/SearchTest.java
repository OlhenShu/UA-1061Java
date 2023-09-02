package edu05.hw1;

import edu05.hw1.Search;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    static int[] numbers1 = {2, 5, 7, 9, -7};
    static int[] numbers2 = {-7, 32, 12, 0, 4, 2, 7, -3, 0, 8};

    @Test
    void testGetPositivePosition() {
        assertEquals(3, Search.getPositivePosition(numbers1, 3));
        assertEquals(5, Search.getPositivePosition(numbers2, 3));
    }

    @Test
    void testGetMin() {
        int[] expect1 = {5, -7};
        int[] expect2 = {1, -7};

        assertArrayEquals(expect1, Search.getMin(numbers1));
        assertArrayEquals(expect2, Search.getMin(numbers2));
    }

    @Test
    void testGetEvenProduct() {
        assertEquals(45, Search.getEvenProduct(numbers1));
        assertEquals(-1536, Search.getEvenProduct(numbers2));
    }
}