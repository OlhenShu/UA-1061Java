package Homework13;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class Birthday {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1988, 8, 29); // Replace with your actual birthday
        printDayOfWeek(birthday);
    }

    public static void printDayOfWeek(LocalDate date) {
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Your birthday is on a " + dayOfWeek);

        LocalDate sixMonthsLater = date.plusMonths(6);
        DayOfWeek dayOfWeek6MonthsLater = sixMonthsLater.getDayOfWeek();
        System.out.println("Six months later, it will be on a " + dayOfWeek6MonthsLater);

        LocalDate twelveMonthsLater = date.plusMonths(12);
        DayOfWeek dayOfWeek12MonthsLater = twelveMonthsLater.getDayOfWeek();
        System.out.println("Twelve months later, it will be on a " + dayOfWeek12MonthsLater);
    }
}