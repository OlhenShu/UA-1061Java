package edu08.hw2;

import edu07.hw1.Employee;
import edu08.hw1.FullName;

public class App {
    public static void main(String[] args) {
        Student[] students = {
                new Student(new FullName("John", "Doe"), 20, 3),
                new Student(new FullName("Robert", "Kennedy"), 17, 1),
        };

        for (Student student : students) {
            System.out.println("=============//==============");
            System.out.println(student.info());
            System.out.println(student.activity());
        }

        Student cloneStudent = students[0].clone();
        cloneStudent.setCourse(2);
        System.out.println("=============/ cloned Student /==============");
        System.out.println(cloneStudent.info());
        System.out.println(cloneStudent.activity());
    }
}
