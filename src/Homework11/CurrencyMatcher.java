import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencyMatcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text containing US currency format:");
        String inputText = scanner.nextLine();

        // Define a pattern to search for US currency format
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");

        // Create a Matcher object for the input text
        Matcher matcher = pattern.matcher(inputText);

        // Search for and print all occurrences of US currency format
        while (matcher.find()) {
            String match = matcher.group();
            System.out.println("US currency format found: " + match);
        }

        scanner.close();
    }
}