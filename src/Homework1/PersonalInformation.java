package Homework1;

import java.util.Scanner;

public class PersonalInformation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("Where do you live, " + name + "?");
        String address = input.nextLine();

        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);

        input.close();
    }
}
