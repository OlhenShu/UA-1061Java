package Homework13;

import java.util.Scanner;

public class TwoMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Encrypt the input sentence with a fixed shift value of 3
        String encrypted = encrypt(input, 3);

        // Decrypt the encrypted sentence with the same shift value
        String decrypted = decrypt(encrypted, 3);

        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                // Apply the Caesar cipher shift
                result.append((char) (base + (c - base + n) % 26));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String decrypt(String s, int n) {
        // Decryption is the same as encryption with a shift of 26 - n
        return encrypt(s, 26 - n);
    }
}
