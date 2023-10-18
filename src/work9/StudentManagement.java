package work9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student {
    public int course;
    private String name;
    private String group;
    //private int course;
    private List<Double> grades;

    public Student (String name, String group, int course, List<Double> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double GetAverGrade() {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

public class StudentManagement {
    public static void removeBadStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.GetAverGrade() < 3.0) {
                iterator.remove();
            } else if (student.GetAverGrade() >= 3.0) {
                student.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Students in Course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Anna", "A1", 1, List.of(4.0, 3.5, 2.5)));
        studentList.add(new Student("Elon", "B1", 1, List.of(3.0, 3.0, 3.0)));
        studentList.add(new Student("Floyd", "C1", 2, List.of(2.0, 2.0, 2.0)));
        studentList.add(new Student("Jack", "D1", 2, List.of(3.5, 3.0, 3.5)));

        System.out.println("Before Removal and Promotion:");
        for (Student student : studentList) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        removeBadStudents(studentList);

        System.out.println("\nList after removal and Promotion: ");
        for (Student student : studentList) {
            System.out.println(student.getName() + " (Course " + student.getCourse() + ")");
        }

        printStudents(studentList, 2);
    }
}

