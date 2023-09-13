package edu09.hw2;

public class App {
    public static void main(String[] args) {
        Students students = new Students();

        students.printStudents();

        students.removes();

        students.printStudents(2);

        students.printStudents();
    }
}
