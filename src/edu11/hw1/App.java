package edu11.hw1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence (at least 5 words)");

        String[] words = scan.nextLine().split(" ");

        String longestWord = "";
        Integer numberOfLetters = 0;

        for (String word : words) {
            if (word.length() > numberOfLetters) {
                numberOfLetters = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word: '" + longestWord + "' number of letters: " + numberOfLetters);

        if (words.length >= 2) {
            StringBuilder stringBuilder = new StringBuilder(words[1]);
            System.out.println("The second word of the sentence in reverse order: '" + stringBuilder.reverse() + "'");
        }
    }

}
