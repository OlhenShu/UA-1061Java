package class10.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Student> students = new ArrayList<>(5);
        students.add(new Student("Kyrylo", 4));
        students.add(new Student("Maria", 5));
        students.add(new Student("Anton", 4));
        students.add(new Student("Zack", 1));
        students.add(new Student("Diana", 3));

        System.out.println("Students enrolled in the 4 course:");
        Student.printStudents(students, 4);

        System.out.println("\nStudents in order by sorting by name:");
        students.sort(Student.compareByName());
        students.forEach(o -> System.out.println("Student "+o.getName()));


        System.out.println("\nStudents in order by sorting by course:");
        students.sort(Student.compareByCourse());
        students.forEach(o -> System.out.println("Student "+o.getName()));
    }
}
