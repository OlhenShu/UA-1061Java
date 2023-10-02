package work01;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        System.out.print("Enter the third string: ");
        String thirdString = scanner.nextLine();

        //scanner.close();

        System.out.println("Reversed order:");
        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);
        System.out.println();
    }
}
