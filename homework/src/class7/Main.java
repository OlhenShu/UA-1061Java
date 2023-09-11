package class7;

import java.util.Arrays;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee(UUID.randomUUID().toString(), "12-3456789", "Vitalii", 25, 84),
                new SalariedEmployee(UUID.randomUUID().toString(), "078-05-1120", "Evgeniya", 4500),
                new SalariedEmployee(UUID.randomUUID().toString(), "390-44-4929", "Bohdan", 890),
        };
        System.out.println("Initial array, not having sorted");
        for (Employee i: employees){
            System.out.println(i.getEmployeeId() + " - " +i.getName());
        }
        System.out.println();
        Arrays.sort(employees, (o1, o2) -> Double.compare(o2.calculatePay(), o1.calculatePay()));

        double sumOfSalaries = 0;
        System.out.println("Modified array sorted in descending order");
        for (Employee i: employees){
            System.out.println(i.getEmployeeId() + " - " +i.getName());
            sumOfSalaries += i.calculatePay();
        }
        double averageSalary = sumOfSalaries/employees.length;
        System.out.printf("\nThe average salary is %.2f", averageSalary);
    }
}
