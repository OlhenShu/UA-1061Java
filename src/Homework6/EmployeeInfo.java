package Homework6;

public class EmployeeInfo {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan Shpak", 29, 2350.0);

        Developer developer = new Developer("Evlampiy Drizd", 25, 2557.0, "Average Java developer");

        System.out.println("Employee Information:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information:");
        System.out.println(developer.report());
    }
}