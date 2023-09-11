package class8.task2;

import class8.task1.Person;

public class Student extends Person implements Cloneable {
    private int course;

    public Student(FullName fullName, int age, int course) throws IllegalArgumentException {
        super(fullName, age);
        if (course <= 0) {
            throw new IllegalArgumentException("Wrong value for course");
        }
        this.course = course;
    }

    public void setCourse(int course) {
        if (course<=0 ){
            throw new IllegalArgumentException("Course value has to be positive");
        }
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + ", " + String.format("Course: %d", course);
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.setFullName(student.getFullName().clone());
        return student;
    }
}
