package edu04.hw4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Season currentSeason = Season.SPRING;
        new Faculty(currentSeason, getCountOfStudents(currentSeason));

        System.out.println(Faculty.getCountOfStudents() + " students studied in the '"
                + Faculty.getCurrentSeason().getSeasonName() + "' season.");

    }

    protected static int getCountOfStudents(Season currentSeason) {
        System.out.println("Enter the number of students in the " + currentSeason.getSeasonName() + " season:");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Please enter a valid Integer number.");
        }
        return scan.nextInt();
    }
}
