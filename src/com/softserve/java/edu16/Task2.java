package com.softserve.java.edu16;

import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) {
        String filePath = "mytext.txt"; // replace with your file path
        List<String> words = readWordsFromFile(filePath);
        
        System.out.println("Words starting with a vowel:");
        for (String word : words) {
            if (startsWithVowel(word)) {
                System.out.println(word);
            }
        }

        System.out.println("\nWords where last letter of one word matches the first letter of the next word:");
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).charAt(words.get(i).length() - 1) == words.get(i + 1).charAt(0)) {
                System.out.println(words.get(i) + " -> " + words.get(i + 1));
            }
        }
    }

    private static List<String> readWordsFromFile(String filePath) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            String[] wordsArray = content.split("\\W+");
            return Arrays.asList(wordsArray);
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private static boolean startsWithVowel(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        return "aeiou".indexOf(firstChar) != -1;
    }
}
