package class11.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static class11.task2.RedundantWhitespacesRemoval.scanner;

public class UsCurrencyMatcher {
    public static void main(String[] args) {
        System.out.print("Enter a value: ");
        final String string = scanner.nextLine();

        final Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        final Matcher matcher = pattern.matcher(string);

        System.out.println("All the occurrences of US currency in the input text: ");
        while (matcher.find()) {
            System.out.printf("\t%s%n", matcher.group());
        }
    }
}
