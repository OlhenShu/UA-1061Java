package hometask2;

public class Student {
    private String name,group;
    private Integer course;
    private double grades;

    private Subjects[] subjects;

    public Student(String name, String group, Integer course, Subjects[] subjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjects = subjects;
        this.calGrades();
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public double getGrades() {
        return grades;
    }

    private void calGrades() {
        double sumGrades = 0;
        for (Subjects subject : this.subjects) {
            sumGrades += subject.getGrade();
        }

        this.grades = sumGrades / this.subjects.length;
    }
}