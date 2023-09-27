package Homework5;

import java.util.Scanner;

public class MonthsNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month's number: ");
        int monthNumber = scanner.nextInt();

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Checking if the entered number is a month number
        if (monthNumber >= 1 && monthNumber <= 12) {
            int daysInMonth = monthDays[monthNumber - 1];
            System.out.println("Number of days in the selected month: " + daysInMonth);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
}








