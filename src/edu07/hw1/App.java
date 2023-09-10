package edu07.hw1;

import java.util.Arrays;

public class App {
    private static Employee[] staff = new Employee[]{
            new ContractEmployee("0001", "Mykola", "12346", 10, 120),
            new ContractEmployee("0002", "Vasil", "78945", 18, 140),
            new ContractEmployee("0003", "Ben", "88898", 10, 95),
            new SalariedEmployee("0004", "Taras", "258", 1200),
            new SalariedEmployee("0005", "Stepan", "965447", 2000),
            new SalariedEmployee("0006", "Nick", "012475", 750),
    };

    public static void main(String[] args) {
        Arrays.sort(staff, new SortBySalary());

        for (Employee employee : staff) {
            System.out.println(employee.report());
        }
    }
}
