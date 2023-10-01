package edu11.hw4;

import java.util.Scanner;

public class App {
    final static String PATTERN = "[a-zA-Z-\\s]+";

    public static void main(String[] args) {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name (can only contain English letters, spaces, and hyphens)");
        while (!(name = scan.nextLine()).matches(PATTERN)) {
            System.out.println("The entered data can contain only English letters, spaces, and hyphens. "
                    + "Please check your details and try again.");
        }

        System.out.printf("Hello %s!%n", name);
    }
}
