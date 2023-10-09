package com.softserve.java.edu04.practical;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of the day of the week (1-7):");
        int dayNumber = scanner.nextInt();

        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Invalid number. Please enter a number between 1 and 7.");
            return;
        }

        String dayNameEnglish = "";
        String dayNameUkrainian = "";

        switch (dayNumber) {
            case 1:
                dayNameEnglish = "Monday";
                dayNameUkrainian = "Понеділок";
                break;
            case 2:
                dayNameEnglish = "Tuesday";
                dayNameUkrainian = "Вівторок";
                break;
            case 3:
                dayNameEnglish = "Wednesday";
                dayNameUkrainian = "Середа";
                break;
            case 4:
                dayNameEnglish = "Thursday";
                dayNameUkrainian = "Четвер";
                break;
            case 5:
                dayNameEnglish = "Friday";
                dayNameUkrainian = "П'ятниця";
                break;
            case 6:
                dayNameEnglish = "Saturday";
                dayNameUkrainian = "Субота";
                break;
            case 7:
                dayNameEnglish = "Sunday";
                dayNameUkrainian = "Неділя";
                break;
        }

        System.out.println("Day in English: " + dayNameEnglish);
        System.out.println("Day in Ukrainian: " + dayNameUkrainian);
    }
}