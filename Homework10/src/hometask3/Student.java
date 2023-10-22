package hometask3;

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

    public String getNam() {
        return name;
    }

    public Integer getCour() {
        return course;
    }

    public static Comparator<Student> compareName() {
        return Comparator.comparing(Student::getNam);
    }

    public static Comparator<Student> compareCourse() {
        return Comparator.comparingInt(Student::getCour);
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