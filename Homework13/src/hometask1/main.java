package hometask1;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string for encryption:");

        String entered = scan.nextLine();
        String encrypted = encrypt(entered, 5);
        String decrypted = decrypt(encrypted, 5);

        System.out.println("Encrypt: " + encrypted);
        System.out.println("Decoded: " + decrypted);
    }


    protected static String encrypt(String s, int n) {
        encrypt encryptString = (str, number) -> {
            String result = new String();

            for (var i = 0; i < str.length(); i++) {
                result += (String.valueOf((char) (str.charAt(i) + number)));
            }
            return result;
        };

        return encryptString.apply(s, n);
    }

    protected static String decrypt(String s, int n) {
        decrypt decrypt = (str, number) -> {
            String result = new String();

            for (var i = 0; i < str.length(); i++) {
                result += (String.valueOf((char) (str.charAt(i) - number)));
            }
            return result;
        };

        return decrypt.apply(s, n);
    }
}
