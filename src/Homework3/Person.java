package Homework3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }
    // Конструктор з двома параметрами (ім'я та прізвище)
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // При тестуванні програми мені не подобалось бачити від'ємні або сміховинно величезні значення в рядках рік та вік,
    // тому вирішив встановити певні обмеження. Відверто кажучи, й гадки не мав, що це займе стільки часу, але розібрався наче, а це не завадить.
    public void setBirthYear(int birthYear) {
        int currentYear = 2023;
        int minYear = 1900;
        if (birthYear >= minYear && birthYear <= currentYear) {
            this.birthYear = birthYear;
        } else {
            throw new IllegalArgumentException("Birth year should be between 1900 and 2023");
        }
    }
    // Обчислює вік на основі поточного року і року народження
    public int getAge() {
        int currentYear = 2023;
        return (birthYear <= currentYear) ? currentYear - birthYear : 0;
    }
    // Метод для введення інформації про особу з консолі
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        setLastName(scanner.nextLine());

        System.out.print("Enter Birth Year: ");
        setBirthYear(scanner.nextInt());
    }
    // Метод для виведення інформації про особу на консоль
    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge() + " years");
    }
    // Метод для зміни імені та/або прізвища
    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
// Створення 5 об'єктів Person та введення інформації про них
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for Person " + (i + 1) + ":");
            Person person = new Person();
            person.input();
            person.output();
        }
    }
}