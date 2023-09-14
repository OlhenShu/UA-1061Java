package class9.task2;

import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private String group;
    private int course;
    private final List<Grade> grades;

    public Student(final String name, final String group, final int course, final List<Grade> grades) {
        if (Objects.isNull(name) || Objects.isNull(group) || course <= 0 || Objects.isNull(grades) || grades.isEmpty()) {
            throw new IllegalArgumentException("Student cannot be created because of incorrect data");
        }
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}
