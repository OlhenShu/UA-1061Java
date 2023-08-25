package edu04;

import java.util.Scanner;

public class DemoSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you enjoy Java? (yes/no/maybe)");
        String input = sc.nextLine();
        String result;
        switch (input.toLowerCase()) {
            case "yes", "maybe" -> result = "Great!";
            case "no" -> result = "Too bad!";
            default -> result = "Wrong!";
        }
        System.out.println(result);

    }
}
