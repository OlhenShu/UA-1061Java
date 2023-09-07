package com.softserve.java.edu07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoStudent {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Oksana", 22),
                new Student("Oksana", 17),
                new Student("Petro", 22),
                new Student("Orest", 19),
                new Student("Polina", 17),
        };
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        Arrays.sort(students, new AgeComparator());

        for (Student student : students) {
            System.out.println(student);
        }
        Arrays.sort(students, new NameComparator());

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
