package edu13.hw4;

import java.time.LocalDate;
import java.time.Month;

public class App {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1983, Month.MAY, 15);
        printDaysOfWeek(localDate);
    }

    protected static void printDaysOfWeek(LocalDate date) {
        System.out.println("Day of current week" + date.getDayOfWeek());

        LocalDate date2 = date.plusMonths(6);
        System.out.println("Day of week (after 6 months)" + date2.getDayOfWeek());

        LocalDate date3 = date.plusYears(1);
        System.out.println("Day of week (after 1 year)" + date3.getDayOfWeek());
    }
}
