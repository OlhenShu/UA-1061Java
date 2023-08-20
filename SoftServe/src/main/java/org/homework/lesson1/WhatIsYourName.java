package src;

import java.util.Scanner;

public class WhatIsYourName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where do you live,(" + name + ") ? ");
        String address = scanner.nextLine();

        System.out.println(" name " + name);
        System.out.println(" address " + address);

        scanner.close();
    }

}

