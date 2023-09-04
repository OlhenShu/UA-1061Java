package class6.task2;

public class EmployeesInformation {
    public static void main(String[] args) {
        final Employee employee = new Employee("John", 32, 20_000);
        System.out.println(employee.report());

        final Developer developer = new Developer("Anton", 22, 50_900, "Average Java developer");
        System.out.println(developer.report());
    }
}
