package org.homework.lesson6;

public class EmployerRun {
    public static void main(String[] args) {

        Employee employee = new Employee(
                "name1",
                45,
                3456.2
        );

        System.out.println(employee.report());
    }
}
