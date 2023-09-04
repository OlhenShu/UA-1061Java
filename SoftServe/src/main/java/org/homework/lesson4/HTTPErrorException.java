package org.homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HTTPErrorException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a number representing an HTTP error (400/401/402)");
        String input = br.readLine();

        var result = switch (input) {
            case "400" -> "Bad Request";
            case "401" -> "Unauthorized";
            case "402" -> "Payment Required";
            default -> "Wrong";

        };
        System.out.println(result);


    }
}
