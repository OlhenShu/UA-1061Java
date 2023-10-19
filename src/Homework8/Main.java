package Homework8;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(new Person.FullName("Vasyl", "Shpak"), 19, 2);
        Student student2 = new Student(new Person.FullName("Sinji", "Takamura"), 19, 1);

        System.out.println("----------------------------");
        System.out.println(student1.info());
        System.out.println("Student 1 activity is " + student1.activity());

        System.out.println("----------------------------");
        System.out.println(student2.info());
        System.out.println("Student 2 activity is " + student2.activity());
        System.out.println("----------------------------");

        try {
            Student clonedStudent = (Student) student2.clone();
            clonedStudent.setCourse(2);

            System.out.println("Cloned Student info: " + clonedStudent.info());
            System.out.println("Cloned Student activity: " + clonedStudent.activity());
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning not supported");
        }
    }
}