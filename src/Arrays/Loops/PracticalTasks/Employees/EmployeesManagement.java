package Arrays.Loops.PracticalTasks.Employees;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

public class EmployeesManagement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee[] employees = {
                new Employee("Bart", 1, 3500),
                new Employee("Homer", 2, 2700),
                new Employee("Lisa", 1, 3600),
                new Employee("Marje", 2, 4000),
                new Employee("Maggy", 3, 1250)
        };

        System.out.println("Enter the department number from one to three to see all employees of this department: ");

        int targetDepartment = input.nextInt();
        while(targetDepartment < 0 || targetDepartment > 3) {
            System.out.println("The number indicated is not a department number. Please try again. ");
            targetDepartment = input.nextInt();
        }
        System.out.println("Employees in department " + targetDepartment + ":");

        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == targetDepartment) {
                System.out.println("Name: " + employee.getName());
                System.out.println("Salary: " + employee.getSalary());
            }
        }



        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.println("\n All employees arranged by salary: ");
        for (Employee employee : employees){
            System.out.println("\n Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
        }


    }
}
