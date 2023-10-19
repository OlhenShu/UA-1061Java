package Homework11;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence of five words:");
        String sentence = scanner.nextLine();

        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        String longestWord = findLongestWord(words);

        if (longestWord != null) {
            System.out.println("The longest word is: " + longestWord);
            int lettersInLongestWord = longestWord.length();
            System.out.println("Number of letters in the longest word: " + lettersInLongestWord);
        } else {
            System.out.println("No words found in the sentence.");
        }

        if (words.length >= 2) {
            String secondWord = words[1];
            String reversedSecondWord = reverseWord(secondWord);
            System.out.println("Second word in reverse order: " + reversedSecondWord);
        } else {
            System.out.println("The sentence does not contain a second word.");
        }

        scanner.close();
    }

    // Function to find the longest word in an array of words
    public static String findLongestWord(String[] words) {
        if (words.length == 0) {
            return null; // No words found
        }

        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    // Function to reverse a word
    public static String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder(word);
        return reversed.reverse().toString();
    }
}