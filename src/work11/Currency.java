package work11;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text containing US currency formats:");
        String inputText = scanner.nextLine();

        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern currencyPattern = Pattern.compile(pattern);

        Matcher matcher = currencyPattern.matcher(inputText);

        while (matcher.find()) {
            String currencyMatch = matcher.group();
            System.out.println("Found currency: " + currencyMatch);
        }
    }
}

