package Homework4;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public enum Season {
        WINTER("Winter"),
        SPRING("Spring"),
        SUMMER("Summer"),
        AUTUMN("Autumn");

        private final String name;

        Season(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();


        System.out.println("Enter the current season (WINTER, SPRING, SUMMER, AUTUMN): ");
        String seasonInput = scanner.next().toUpperCase();
        Season currentSeason = Season.valueOf(seasonInput);

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);


        System.out.println("Faculty Information:");
        System.out.println("Number of Students: " + faculty.getNumberOfStudents());
        System.out.println("Current Season: " + faculty.getCurrentSeason());
    }
}
