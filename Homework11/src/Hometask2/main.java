package Hometask2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence, please:");
        String sentence = scan.nextLine();
        System.out.println(sentence.trim().replaceAll(" +", " "));
    }
}