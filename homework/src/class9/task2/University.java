package class9.task2;

import java.util.ArrayList;
import java.util.List;

public class University {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrii Tkachyshyn", "MD-21", 2, List.of(
                new Grade(Subject.UKRAINIAN, 5), new Grade(Subject.BIOLOGY, 3)))
        );
        students.add(new Student("Vitalii Fedyk", "RI-32", 3, List.of(
                        new Grade(Subject.IT, 4), new Grade(Subject.ENGLISH, 2)))
        );
        students.add(new Student("Yana Kyryliv", "MG-11", 1, List.of(
                        new Grade(Subject.MATHS, 2), new Grade(Subject.GEOGRAPHY, 3)))
        );
        students.add(new Student("Dmytro Khrohmaliuk", "IT-12", 1, List.of(
                new Grade(Subject.MATHS, 3), new Grade(Subject.GEOGRAPHY, 3)))
        );
        System.out.println("All students: ");
        students.forEach(System.out::println);

        System.out.println("\nStudents which study in the first year: ");
        StudentUtil.print(students, 1);
        System.out.println();

        System.out.println("Students can be promoted to the next course level: ");
        StudentUtil.removeIfAverageGradeIsLess(students, 3);
        students.forEach(System.out::println);
    }
}
