package org.practice.lesson3;

public class EmployeeRun {
    public static void main(String[] args){
        Employee employee1 = new Employee("Igor",2,3);
        Employee employee2 = new Employee("Peter", 3, 5);
        Employee employee3 = new Employee("Stephan", 2, 4);

        Employee.totalSum =
                employee1.getSalary() + employee1.getBonuses() +
                employee2.getSalary() + employee2.getBonuses() +
                employee3.getSalary() + employee3.getBonuses();

        System.out.println(Employee.totalSum);
    }
}
