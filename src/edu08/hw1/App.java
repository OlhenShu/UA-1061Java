package edu08.hw1;

public class App {
    public static void main(String[] args) {
        PersonTest person = new PersonTest(new FullName("John", "Doe"), 75, "Homeless");
        System.out.println(person.info());
        System.out.println(person.activity());
    }
}
