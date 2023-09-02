package edu06.hw2;

import edu06.hw1.Bird;

public class App {
    private static Employee[] staff = new Employee[]{
            new Employee("Mykola", 27, 25000.12),
            new Developer("Taras", 32, 35877.11, "Average Java developer"),
    };

    public static void main(String[] args) {
        for (Employee employee : staff) {
            System.out.println(employee.report());
        }
    }
}
