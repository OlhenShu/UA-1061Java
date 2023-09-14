package class9.task2;

import java.util.List;
import java.util.OptionalDouble;

import static java.lang.System.*;

public class StudentUtil {
    public static void print(List<? extends Student> students, int course) {
        students.stream()
                .filter(o -> o.getCourse() == course)
                .forEach(o -> out.println(o.getName()));
    }

    private static OptionalDouble findAverage(final Student student) {
        return student.getGrades().stream()
                .mapToDouble(Grade::getGrade)
                .average();
    }

    public static void removeIfAverageGradeIsLess(List<? extends Student> students, double mark) {
        students.removeIf((o) -> {
            OptionalDouble averageMark = findAverage(o);
            if (averageMark.isPresent()) {
                return averageMark.getAsDouble() < mark;
            } else {
                return false;
            }
        });
    }
}