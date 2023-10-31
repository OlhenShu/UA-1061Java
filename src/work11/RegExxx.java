package work11;

import java.util.Scanner;

public class RegExxx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String s1 = scan.nextLine();

        String cleaneds1 = s1.replaceAll("\\s+", " ");

        System.out.println(cleaneds1);
    }
}

