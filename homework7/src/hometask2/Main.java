package hometask2;

public class Main {
    private static Employee[] havepos = new Employee[]{
            new Employee("Vasil", 24, 20000),
            new Developer("Nazarii", 29, 23523, "Java Dev"),
    };

    public static void main(String[] args) {
        for (Employee employee : havepos) {
            System.out.println(employee.report());
        }
    }
}
