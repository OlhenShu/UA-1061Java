package edu03.hw3;

import java.util.Calendar;

import edu03.Helper;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int personNumber;

    public static int count;

    public Person() {
        this.setPersonNumber(++count);
        this.input();
    }

    public Person(String firstName, String lastName) {
        this.setPersonNumber(++count);
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

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    public void setPersonNumber(int personNumber) {
        this.personNumber = personNumber;
    }

    public void input() {
        System.out.println("Fill data for Person #" + this.getPersonNumber());
        this.setFirstName(Helper.getEnteredString("Input first name:"));
        this.setLastName(Helper.getEnteredString("Input Last name:"));
        this.setBirthYear(Helper.getEnteredIntNumber("Birthday year:"));
    }

    public void output() {
        System.out.println("Person data #" + this.getPersonNumber() + ":");
        System.out.println("First name: " + this.getFirstName());
        System.out.println("Last name: " + this.getLastName());
        System.out.println("Birthday year: " + this.getBirthYear() + " (" + this.getAge() + " years)");
    }

    public int getAge() {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        return currentYear - this.getBirthYear();
    }

    public void changeName(String fn, String ln) {
        this.setFirstName(fn);
        this.setLastName(ln);
    }
}
