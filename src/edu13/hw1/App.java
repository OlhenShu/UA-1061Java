package edu13.hw1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string to encrypt:");

        String enteredString = scan.nextLine();
        String encodedString = encrypt(enteredString, 5);
        String decodedString = decrypt(encodedString, 5);

        System.out.println("Encrypt word: " + encodedString);
        System.out.println("Decoded word: " + decodedString);
    }


    protected static String encrypt(String s, int n) {
        Encrypt encryptString = (str, number) -> {
            String result = new String();

            for (var i = 0; i < str.length(); i++) {
                result += (String.valueOf((char) (str.charAt(i) + number)));
            }
            return result;
        };

        return encryptString.apply(s, n);
    }

    protected static String decrypt(String s, int n) {
        Decrypt decrypt = (str, number) -> {
            String result = new String();

            for (var i = 0; i < str.length(); i++) {
                result += (String.valueOf((char) (str.charAt(i) - number)));
            }
            return result;
        };

        return decrypt.apply(s, n);
    }
}
