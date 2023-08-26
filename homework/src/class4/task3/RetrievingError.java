package class4.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RetrievingError {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Input a number representing an HTTP error: ");
            int value = Integer.parseInt(bufferedReader.readLine());

            System.out.println("This is " + HTTPError.getHTTPError(value));
        } catch (IOException e) {
            System.out.println("It is impossible to read data");
        } catch (NumberFormatException e) {
            System.out.println("The input number should have a corresponding format");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}