package edu13.hw3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year:");
        Integer year = scan.nextInt();

        System.out.println(isLeapYear(year) ? "Is leap year." : "Not a leap year.");

    }

    protected static boolean isLeapYear(int year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}
