package work6;

public class Main1 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 30, 50000.50);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println("Employee Information:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information:");
        System.out.println(developer.report());
    }
}
