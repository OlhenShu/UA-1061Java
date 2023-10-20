package Homework10.Task3;
import java.util.List;
import java.util.Iterator;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public static void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students enrolled in course " + courseNumber + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == courseNumber) {
                System.out.println(student.getName());
            }
        }
    }

    public static int compareByName(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }

    public static int compareByCourse(Student student1, Student student2) {
        return Integer.compare(student1.getCourse(), student2.getCourse());
    }
}