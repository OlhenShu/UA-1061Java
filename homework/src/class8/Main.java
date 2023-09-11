package class8;

import class8.task1.Person;
import class8.task2.Student;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student(new Person.FullName("Vitalii", "Fedyk"), 19, 3);
        Student student2 = new Student(new Person.FullName("Yaryna", "Mryhlotska"), 18, 2);

        System.out.println(student1.info());
        System.out.println(student1.activity() + "\n");

        System.out.println(student2.info());
        System.out.println(student2.activity() + "\n");

        Student clonedStudent = student1.clone();
        System.out.println("Cloned and changed values of the first student");
        student1.getFullName().setFirstName("Kyrylo");
        student1.setCourse(5);
        System.out.println(student1.info());
        System.out.println(clonedStudent.info());
    }
}
