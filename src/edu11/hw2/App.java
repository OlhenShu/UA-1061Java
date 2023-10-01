package edu11.hw2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();

        System.out.println(sentence.trim().replaceAll(" +", " "));
    }
}
