package org.homework.lesson8;

public class StudentRun {
    public static void main(String[] args) throws CloneNotSupportedException {
        FullName fullName1 = new FullName("John", "Doe");
        FullName fullName2 = new FullName("Alice","Smith");

        Student student1 = new Student(fullName1, 20,1);
        Student student2 = new Student(fullName2, 21,2);



        System.out.println(student1.info());
        System.out.println(student1.activity());
        System.out.println(student2.info());
        System.out.println(student2.activity());

        Student copyOfStudent = (Student) student1.clone();
        copyOfStudent.setCourse(3);

        System.out.println(copyOfStudent.info());
        System.out.println(copyOfStudent.activity() );


    }
}
