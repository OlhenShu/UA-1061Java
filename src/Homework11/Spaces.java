import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence with multiple spaces:\n");
        String inputSentence = scanner.nextLine();

        // Replace consecutive spaces with a single space using regular expressions
        String cleanedSentence = inputSentence.replaceAll("\\s+", " ");

        System.out.println("Cleaned sentence: " + cleanedSentence);

        scanner.close();
    }
}