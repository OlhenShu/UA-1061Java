package class1.task2;

import java.util.Scanner;

public class AskingQuestions {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("What is your name?");
        final String name = scanner.nextLine();
        System.out.println("Where do you live, ".concat(name).concat("?"));
        final String address = scanner.nextLine();

        System.out.println("\nThis is all information about the user: ");
        System.out.println("Name is " + name);
        System.out.println("Address is " + address);
    }
}
