package work8;

class Persons {
    protected String name;

    public Persons(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Name: " + name);
    }

    public String activity() {
        return "I am a person";
    }
}

class Student extends Person {
    private int course;

    public Student(String name, int course) {
        super(name);
        this.course = course;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Course: " + course);
    }

    @Override
    public String activity() {
        return "I study at university";
    }

    public Student cloneWithCourse(int newCourse) {
        return new Student(super.name, newCourse);
    }
}

public class Mains {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 3);
        Student student2 = new Student("Bob", 2);

        System.out.println("Student 1:");
        student1.info();
        System.out.println(student1.activity());

        System.out.println("\nStudent 2:");
        student2.info();
        System.out.println(student2.activity());

        Student student3 = student1.cloneWithCourse(4);
        System.out.println("\nStudent 3 (cloned from Student 1 and course changed):");
        student3.info();
        System.out.println(student3.activity());
    }
}


