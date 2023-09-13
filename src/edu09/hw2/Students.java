package edu09.hw2;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Student> students = new ArrayList<>();

    public Students() {
        this.generateStudentsList();
    }

    private void generateStudentsList() {
        this.students.add(new Student("Student1", "A1", 1, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 2),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 4),
                new Subjects(Subject.MATH.getName(), 2),
                new Subjects(Subject.PHYSICS.getName(), 3),
        }));
        this.students.add(new Student("Student2", "A1", 1, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 3),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 2),
                new Subjects(Subject.MATH.getName(), 2),
                new Subjects(Subject.PHYSICS.getName(), 3),
        }));
        this.students.add(new Student("Student3", "A1", 1, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 4),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 4),
                new Subjects(Subject.MATH.getName(), 3),
                new Subjects(Subject.PHYSICS.getName(), 4),
        }));
        this.students.add(new Student("Student4", "A1", 1, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 3),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 3),
                new Subjects(Subject.MATH.getName(), 2),
                new Subjects(Subject.PHYSICS.getName(), 3),
        }));
        this.students.add(new Student("Student5", "A3", 3, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 4),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 4),
                new Subjects(Subject.MATH.getName(), 4),
                new Subjects(Subject.PHYSICS.getName(), 3),
        }));
        this.students.add(new Student("Student6", "A3", 3, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 2),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 3),
                new Subjects(Subject.MATH.getName(), 2),
                new Subjects(Subject.PHYSICS.getName(), 2),
        }));
        this.students.add(new Student("Student7", "A3", 3, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 2),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 5),
                new Subjects(Subject.MATH.getName(), 3),
                new Subjects(Subject.PHYSICS.getName(), 2),
        }));
        this.students.add(new Student("Student8", "A3", 3, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 4),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 4),
                new Subjects(Subject.MATH.getName(), 2),
                new Subjects(Subject.PHYSICS.getName(), 3),
        }));
        this.students.add(new Student("Student9", "A4", 4, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 5),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 5),
                new Subjects(Subject.MATH.getName(), 4),
                new Subjects(Subject.PHYSICS.getName(), 4),
        }));
        this.students.add(new Student("Student10", "A4", 4, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 3),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 2),
                new Subjects(Subject.MATH.getName(), 3),
                new Subjects(Subject.PHYSICS.getName(), 3),
        }));
        this.students.add(new Student("Student11", "A4", 4, new Subjects[]{
                new Subjects(Subject.ENGLISH.getName(), 3),
                new Subjects(Subject.COMPUTER_SCIENCE.getName(), 4),
                new Subjects(Subject.MATH.getName(), 2),
                new Subjects(Subject.PHYSICS.getName(), 4),
        }));
    }

    public void printStudents() {
        System.out.println("List of Students:");
        for (Student student : this.students) {
            System.out.println(student.getName() + " "
                    + student.getGroup() + " " + student.getCourse()
                    + " " + student.getGrades());
        }
        System.out.println("=============//================");
    }

    public void printStudents(int course) {
        System.out.println("Students enrolled in the <" + course + "> course");
        for (Student student : this.students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
        System.out.println("=============//================");
    }

    public void removes() {
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            if (student.getGrades() < 3) {
                students.remove(i);
            }
        }
        this.toNextCourse();
    }

    private void toNextCourse() {
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            student.setCourse(student.getCourse() + 1);
        }
    }
}
