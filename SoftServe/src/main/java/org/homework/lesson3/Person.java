package org.homework.lesson3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }
    public Person(
            String firstName,
            String lastName
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return 2023 - birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static Person input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Input Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Input Birth Year:");
        Integer birthYear = scanner.nextInt();

        Person person = new Person(firstName,lastName);
        person.setBirthYear(birthYear);

        return person;
    }

    public void output() {
        System.out.println("First Name:" + firstName);
        System.out.println("Last Name:" + lastName);
        System.out.println("Birth Year:" + birthYear);
        System.out.println("Age:" + getAge());
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
