package org.homework.lesson3;

import java.util.Scanner;

public class PersonRun {
    public static void main(String[] args) {
        Person person = Person.input();
        person.output();
        person.changeName("Greg","Romanov");
        person.output();
    }
}
