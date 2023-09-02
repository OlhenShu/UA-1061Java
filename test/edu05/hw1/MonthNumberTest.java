package edu05.hw1;

import edu05.hw1.MonthNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthNumberTest {

    @Test
    void testGetDayOfMonthByNumber() {
        assertEquals(31, MonthNumber.getDayOfMonthByNumber(12));
        assertEquals(28, MonthNumber.getDayOfMonthByNumber(2));
    }

    @Test
    void getMonthName() {
        assertEquals("May", MonthNumber.getMonthName(5));
    }
}