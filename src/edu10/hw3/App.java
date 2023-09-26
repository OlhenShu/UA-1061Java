package edu10.hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(
                Arrays.asList(
                        new Student("Orest", 1),
                        new Student("Taras", 2),
                        new Student("Philip", 1),
                        new Student("Robert", 3),
                        new Student("Carl", 2)
                )
        );

        System.out.println("Students enrolled in 2 course:");
        Student.printStudents(students, 2);

        System.out.println("Students sorted by name:");
        students.sort(Student.compareByName());
        System.out.println(students);

        System.out.println("Students sorted by course:");
        students.sort(Student.compareByCourse());
        System.out.println(students);
    }
}
