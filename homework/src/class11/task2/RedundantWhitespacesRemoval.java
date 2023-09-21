package class11.task2;

import java.util.Scanner;

public class RedundantWhitespacesRemoval {
    public final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter an initial value: ");
        final String intialString = scanner.nextLine();
        final String modifiedString = StringUtil.reduceRedundantWhitespaces(intialString);

        System.out.println("\nInitial is '".concat(intialString) + "'");
        System.out.println("Modified is '".concat(modifiedString) + "'");
    }
}
