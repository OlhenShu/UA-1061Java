package class1.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) {
        try (final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the first value:");
            final String first = bufferedReader.readLine();

            System.out.println("Enter the second value:");
            final String second = bufferedReader.readLine();

            System.out.println("Enter the third value:");
            final String third = bufferedReader.readLine();

            System.out.println("\n" + third);
            System.out.println(second);
            System.out.println(first);
        } catch (IOException e) {
            System.out.println("Something went wrong!");
        }
    }
}
