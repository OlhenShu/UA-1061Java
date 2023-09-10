package edu08.hw2;

import edu08.hw1.FullName;
import edu08.hw1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + " course: " + this.course;
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() {
        try {
            Student student = (Student) super.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
