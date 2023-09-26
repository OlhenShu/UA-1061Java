package edu10.hw3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public static void printStudents(List<Student> students, Integer course) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course.equals(course)) {
                System.out.println(student.name + " ");
            }
        }
    }

    @Override
    public String toString() {
        return name + " (" + course + ")";
    }
}
