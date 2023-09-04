package org.homework.lesson4;

import org.homework.lesson3.Person;

import java.util.Scanner;

public class FacultyRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the information about the number of students:");
        int countOfStudents = scanner.nextInt();

        System.out.println("Input the season:");
        String season = scanner.next();

        Faculty faculty = new Faculty(countOfStudents,Season.valueOf(season));
        System.out.println(faculty);

        scanner.close();

    }
}
