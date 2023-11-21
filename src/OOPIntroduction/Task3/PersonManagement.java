package OOPIntroduction.Task3;

import java.util.Scanner;

public class PersonManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person[] persons = new Person[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of Persons:");
        for (Person person : persons) {
            person.output();
            System.out.println();
        }
    }


}
