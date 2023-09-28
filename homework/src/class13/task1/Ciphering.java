package class13.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ciphering {
    public static void main(String[] args) {
        final Security security = new Security() {
            @Override
            public String encrypt(final String text, final int n) {
                if (n < 0 || n > 26) {
                    throw new IllegalArgumentException("Value of n has to be between [0; 26]");
                }
                final StringBuilder stringBuilder = new StringBuilder();
                final char[] chars = text.toCharArray();
                final char leftBorder = 'a';
                final char rightBorder = 'z';
                final int quantity = rightBorder - leftBorder + 1;

                for (char i : chars) {
                    if (leftBorder <= i && i <= rightBorder ||
                            Character.toUpperCase(leftBorder) <= i && i <= Character.toUpperCase(rightBorder)) {
                        char startOfCountdown = Character.isLowerCase(i) ? leftBorder : Character.toUpperCase(leftBorder);
                        stringBuilder.append((char) (startOfCountdown + (i - startOfCountdown + n) % quantity));
                    } else {
                        stringBuilder.append(i);
                    }
                }

                return stringBuilder.toString();
            }

            @Override
            public String decrypt(final String text, final int n) {
                if (n < 0 || n > 26) {
                    throw new IllegalArgumentException("Value of n has to be between [0; 26]");
                }
                final StringBuilder stringBuilder = new StringBuilder();
                final char[] chars = text.toCharArray();
                final char leftBorder = 'a';
                final char rightBorder = 'z';
                final int quantity = rightBorder - leftBorder + 1;

                for (char i : chars) {
                    if (leftBorder <= i && i <= rightBorder ||
                            Character.toUpperCase(leftBorder) <= i && i <= Character.toUpperCase(rightBorder)) {
                        char startOfCountdown = Character.isLowerCase(i) ? leftBorder : Character.toUpperCase(leftBorder);
                        stringBuilder.append((char) (startOfCountdown + (quantity + i - startOfCountdown - n) % quantity));
                    } else {
                        stringBuilder.append(i);
                    }
                }

                return stringBuilder.toString();
            }
        };

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a text: ");
            final String text = bufferedReader.readLine();
            System.out.print("Enter a value: ");
            final int n = Integer.parseInt(bufferedReader.readLine());

            final String encryptedText = security.encrypt(text, n);
            System.out.println("The encrypted text is: ".concat(encryptedText));
            final String decryptedText = security.decrypt(encryptedText, n);
            System.out.println("The decrypted text is: ".concat(decryptedText));

            if (text.equals(decryptedText)) {
                System.out.println("The initial is the same as the decrypted");
            } else {
                System.out.println("The initial is not the same as the decrypted");
            }
        } catch (IOException e) {
            System.out.println("Something went wrong while reading");
        } catch (NumberFormatException e) {
            System.out.println("Format of number is incorrect");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
