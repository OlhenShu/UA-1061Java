package hometask3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>(
                Arrays.asList(
                        new Student("Jimmy", 1),
                        new Student("Sheen", 2),
                        new Student("Goro", 1),
                        new Student("Kiryu", 3),
                        new Student("Carl", 2)
                )
        );

        System.out.println("Students enrolled in (2) course:");
        Student.printStudents(students, 2);

        System.out.println("Students which sorted (name):");
        students.sort(Student.compareName());
        System.out.println(students);

        System.out.println("Students which sorted (course):");
        students.sort(Student.compareCourse());
        System.out.println(students);
    }
}