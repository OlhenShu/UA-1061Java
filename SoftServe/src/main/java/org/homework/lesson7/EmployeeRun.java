package org.homework.lesson7;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRun {
    public static void main(String[] args) {

        List<Employee> employees =  new ArrayList(4);

        employees.add(new SalariedEmployee("S001", "John", 5000.0, "123-45-6789"));
        employees.add(new SalariedEmployee("S002", "Alice", 6000.0, "987-65-4321"));
        employees.add(new ContractEmployee("C001", "Bob", 20.0, 160, "5678"));
        employees.add(new ContractEmployee("C002", "Eve", 25.0, 140, "9876"));

        System.out.println("Employee Details (Descending Order of Average Monthly Wage):");
        employees.sort(new SalaryComparatror());

        for (Employee employee : employees) {
                System.out.println("Employee ID: " + employee.getEmployerId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Average Monthly Wage: " + employee.calculatePay());
                System.out.println();
        }
    }

}




