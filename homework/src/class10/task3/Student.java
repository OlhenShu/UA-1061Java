package class10.task3;

import lombok.Getter;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Getter
public class Student {
    private String name;
    private int course;

    public Student(String name, int course) throws IllegalArgumentException {
        if (Objects.isNull(name) || course <= 0) {
            throw new IllegalArgumentException("Impossible to create a user");
        }
        this.name = name;
        this.course = course;
    }

    public static Comparator<Student> compareByName() {
        return Comparator.comparing(Student::getName);
    }

    public static Comparator<Student> compareByCourse() {
        return Comparator.comparingInt(Student::getCourse);
    }

    public static void printStudents(List<? extends Student> list, Integer course) throws IllegalArgumentException {
        if (Objects.isNull(list) || Objects.isNull(course)) {
            throw new IllegalArgumentException("Input data cannot be null");
        }
        Iterator<? extends Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println("Name is " + student.getName());
            }
        }
    }
}
