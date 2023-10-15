package task2;

import task1.FullName;

public class main {
    public static void main(String[] args) {
        student[] students = {
                new student(new FullName("Raphael", "York"), 21, 4),
                new student(new FullName("John", "Smith"), 18, 2),
        };

        for (student student : students) {
            System.out.println(student.info());
            System.out.println(student.activity());
        }

        student cloneStudent = students[0].clone();
        cloneStudent.setCourse(2);
        System.out.println("cloned student");
        System.out.println(cloneStudent.info());
        System.out.println(cloneStudent.activity());
    }
}