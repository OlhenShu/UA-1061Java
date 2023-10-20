package Homework10.Task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Papua Ntonge", 3));
        students.add(new Student("Ingmar Bergman", 4));
        students.add(new Student("Bob Dilan", 2));

        // Print students enrolled in course 4
        Student.printStudents(students, 4);

        // Sort students by name
        Collections.sort(students, Student::compareByName);

        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        // Sort students by course
        Collections.sort(students, Student::compareByCourse);

        System.out.println("Students sorted by course:");
        for (Student student : students) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }
    }
}
