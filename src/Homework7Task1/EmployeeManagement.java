package Homework7Task1;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new SalariedEmployee("002458", "Andriy", 1225.0);
        employees[1] = new ContractEmployee("002568", "Ivan", 5.0, 200);
        employees[2] = new SalariedEmployee("002598", "Vasspasian", 800.0);
        employees[3] = new ContractEmployee("002568", "Federico", 8.0, 200);
        employees[4] = new SalariedEmployee("002598", "Archibald", 1999.0);

        // Sort employees in descending order of the average monthly wage
        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());


        System.out.println("Employee Information (Descending Order of Average Monthly Wage):");
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Average Monthly Wage: $" + employee.calculatePay());
            System.out.println("----------------------------");
        }
    }
}
