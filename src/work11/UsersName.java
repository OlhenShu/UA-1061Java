package work11;
import java.util.Scanner;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsersName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean result = false;

        String[] phrases = {
                "Congrats for ",
                "You are right ",
                "Very good ",
                "Well done "
        };

        while (result = true){
            System.out.println("Enter your name: ");
            String regexxx = "^[a-zA-Z -]+$";
            String input = scan.nextLine();

            Pattern pattern = Pattern.compile(regexxx);
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                int randomIndex = rand.nextInt(phrases.length);
                System.out.println("Your name: " + phrases[randomIndex] + input + "!");
                result = false;
                break;
            } else {
                System.out.println("The input does not match the pattern.");
            }
        }
    }
}
