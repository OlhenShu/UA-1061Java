package edu03;

import java.util.Scanner;

public class Helper {
    static public int getEnteredIntNumber(String msg) {
        Scanner scan = new Scanner(System.in);
        System.out.println(msg);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Please enter a valid Integer number.");
        }
        return scan.nextInt();
    }

    static public String getEnteredString(String msg) {
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println(msg);
        while ((line = scan.nextLine()).isEmpty()) {
            scan.next();
            System.out.println("Please enter not empty string.");
        }
        return line;
    }
}
