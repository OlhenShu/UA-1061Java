package class9.task2;

import java.util.Objects;

public class Grade {
    private Subject subject;
    private int grade;

    public Grade(Subject subject, int grade) {
        if (Objects.isNull(subject) || grade <= 0) {
            throw new IllegalArgumentException("Wrong data during creating a mark");
        }
        this.subject = subject;
        this.grade = grade;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "subject=" + subject +
                ", grade=" + grade +
                '}';
    }
}
