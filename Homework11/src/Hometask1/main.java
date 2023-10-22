package Hometask1;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence (least 5 words)");

        String[] words = scan.nextLine().split(" ");

        String longestWord = "";
        Integer numberOfLetters = 0;

        for (String word : words) {
            if (word.length() > numberOfLetters) {
                numberOfLetters = word.length();
                longestWord = word;
            }
        }

        System.out.println("Longest word is: '" + longestWord + "' and a number of letters: " + numberOfLetters);

        if (words.length >= 2) {
            StringBuilder stringBuilder = new StringBuilder(words[1]);
            System.out.println("The second word of the sentence in reverse order are: '" + stringBuilder.reverse() + "'");
        }
    }
}
