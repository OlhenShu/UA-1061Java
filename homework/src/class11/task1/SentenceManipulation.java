package class11.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

import static class11.task2.RedundantWhitespacesRemoval.scanner;

public class SentenceManipulation {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        final String sentence = scanner.nextLine();
        final String[] words = sentence.split("\\s+");

        final Optional<String> longestWord = Arrays.stream(words)
                .max(Comparator.comparingInt(String::length));

        longestWord.ifPresent(s -> {
            System.out.println("The first longest word is '".concat(s).concat("'"));
            System.out.println("The length of it is " + s.length());
        });

        if (words.length >=2) {
            final StringBuilder stringBuilder = new StringBuilder(words[1]);
            System.out.println("The second reversed word is " + stringBuilder.reverse());
        }
    }
}
