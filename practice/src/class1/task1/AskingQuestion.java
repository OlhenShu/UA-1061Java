package class1.task1;

import java.util.Scanner;

public class AskingQuestion {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        final String reply = scanner.nextLine();
        System.out.println("You are ".concat(reply));
    }
}
