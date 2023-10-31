package work11;
import java.util.Scanner;
public class String123 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 words sentence: ");
        String str1 = scan.nextLine();

        String[] str2;
        str2 = str1.split(" ");

        String longestWord = "";

        for (String word : str2) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String reversed = null;
        if (str2.length > 1) {
            String word2 = str2[1];
            reversed = new StringBuilder(word2).reverse().toString();
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Number of letters in the longest word: " + longestWord.length());
        System.out.println("Reversed 2 word: " + reversed);
    }

}
