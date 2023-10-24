package work10;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student> {
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
    public void printStudents(List<Student> students, int courseNumber) {
        System.out.println("Students in Course " + courseNumber + ":");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.course == courseNumber) {
                System.out.println(student.name);
            }
        }
    }

    @Override
    public int compareTo(Student otherStudent) {
        return this.name.compareTo(otherStudent.name);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 101));
        students.add(new Student("David", 103));
        students.add(new Student("Eve", 101));

        Collections.sort(students);
        System.out.println("Students sorted by name:");
        for (Student student : students) {
            System.out.println(student.name + " (Course " + student.course + ")");
        }

        students.sort((s1, s2) -> Integer.compare(s1.course, s2.course));
        System.out.println("\nStudents sorted by course:");
        for (Student student : students) {
            System.out.println(student.name + " (Course " + student.course + ")");
        }

        students.get(0).printStudents(students, 101);
    }
}
