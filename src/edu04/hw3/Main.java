package edu04.hw3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the error code:");
        Scanner scan = new Scanner(System.in);
        String errorCode = scan.nextLine();
        if (HTTPError.isCodeExist("E" + errorCode)) {
            HTTPError error = HTTPError.valueOf("E" + errorCode);
            System.out.println(error.getCode() + " " +error.getName());
        } else {
            System.out.println("The code you entered does not exist.");
        }
    }
}
