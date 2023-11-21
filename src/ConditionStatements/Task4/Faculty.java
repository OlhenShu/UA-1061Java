package ConditionStatements.Task4;

import java.util.Scanner;

public class Faculty {
    private int numberOfStudents;
    private CurrentSeason season;

    public Faculty(int numberOfStudents, CurrentSeason season){
        this.numberOfStudents = numberOfStudents;
        this.season = season;
    }

    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        this.numberOfStudents = input.nextInt();

        input.nextLine();

        System.out.println("Enter the name of season: ");
        this.season = CurrentSeason.valueOf(input.nextLine().toUpperCase());
    }

    public CurrentSeason getNameOfSeason() {
        return season;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public static void main(String[] args) {
        Faculty faculty = new Faculty(0,null);
        faculty.input();

        System.out.println("\nInformation about the faculty: ");
        System.out.println("Number of Students: " + faculty.getNumberOfStudents());
        System.out.println("Current Season: " +  faculty.getNameOfSeason().getDescription());
    }
}
