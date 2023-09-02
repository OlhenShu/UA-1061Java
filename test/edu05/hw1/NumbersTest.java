package edu05.hw1;

import edu05.hw1.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
    int[] numbers2 = {23,-8,5,2,-4,6,1,8,11,10};

    @Test
    void testSumm() {
        assertEquals(6, Numbers.getSumm(numbers1, 3));
        assertEquals(15, Numbers.getSumm(numbers1, 5));
        assertEquals(18, Numbers.getSumm(numbers2, 5));
    }

    @Test
    void testProduct() {
        assertEquals(5280, Numbers.getProduct(numbers2, 5));
        assertEquals(30240, Numbers.getProduct(numbers1, 5));
    }

    @Test
    void testPositiveNumbers() {
        assertTrue(Numbers.isNumbersPositive(numbers1, 5));
        assertFalse(Numbers.isNumbersPositive(numbers2, 5));
    }
}