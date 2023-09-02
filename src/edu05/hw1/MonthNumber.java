package edu05.hw1;

import edu05.InputData;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class MonthNumber {
    static int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        // Day of Month
        int dayOfMonth = InputData.getEnteredIntNumber("Enter the number of the month for which you need to know the number of days.");
        System.out.println("There are " + MonthNumber.getDayOfMonthByNumber(dayOfMonth)
                + " days in " + MonthNumber.getMonthName(dayOfMonth));
    }

    public static int getDayOfMonthByNumber(int number) {
        return month[number - 1];
    }

    public static String getMonthName(int number) {
        return Month.of(number).getDisplayName(TextStyle.FULL, Locale.US);
    }
}
