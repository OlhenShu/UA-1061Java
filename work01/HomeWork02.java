package work01;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String name = scan.nextLine();

        System.out.print("Where do you live, " + name + "?: ");
        String address = scan.nextLine();

        System.out.println("Your name is: " + name + ".");
        System.out.println("Your address is: " + address + ".");

    }
}
