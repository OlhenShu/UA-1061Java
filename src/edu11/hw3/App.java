package edu11.hw3;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    final static String PATTERN = "\\$\\d+\\.\\d{2}";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text to be analyzed: ");

        Pattern pattern = Pattern.compile(PATTERN);
        Matcher matcher = pattern.matcher(scan.nextLine());

        System.out.println("All occurrences of the US currency format in the input text: ");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
