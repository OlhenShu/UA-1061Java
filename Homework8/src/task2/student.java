package task2;
import task1.FullName;
import task1.person;
public class student extends person implements Cloneable {
    private int course;

    public student(FullName fullName, int age, int course) {
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
    public student clone() {
        try {
            student student = (student) super.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}