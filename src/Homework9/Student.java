package Homework9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int course;
    private String group;
    private List<Double> grades;

    public Student(String name, int course, String group, List<Double> grades) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.grades = grades;
    }


    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public List<Double> getGrades() {
        return grades;
    }

    // Method to calculate the Grade Point Average (GPA)
    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double totalPoints = 0;
        for (double grade : grades) {
            totalPoints += grade;
        }
        return totalPoints / grades.size();
    }

    // Method to promote a student to the next course if their GPA is >= 3.0
    public void promoteStudent() {
        double gpa = calculateGPA();
        if (gpa >= 3.0) {
            course++;
        }
    }

    // Overridden toString() method for displaying student information
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }

    // Method to print the names of students enrolled in a specific course
    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Basil", 2, "Group A12", List.of(3.0, 4.0, 5.0, 3.0, 4.0)));
        students.add(new Student("Ivan", 2, "Group A12", List.of(2.0, 2.0, 2.0, 3.0, 3.0)));
        students.add(new Student("Varfolomiy", 2, "Group A12", List.of(5.0, 4.0, 5.0, 3.0, 4.0)));

        System.out.println("Initial Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Remove students with a GPA less than 3.0 and promote others
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.calculateGPA() < 3.0) {
                iterator.remove();
            } else {
                student.promoteStudent();
            }
        }

        System.out.println("\nStudents after Promotion and Removal:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Print names of students in a specific course
        int courseNumber = 3;  // You can change the course as needed
        printStudents(students, courseNumber);
    }
}