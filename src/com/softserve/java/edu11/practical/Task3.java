package com.softserve.java.edu11.practical;

import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            if (check(str)) {
                System.out.println("OK");
            } else {
                System.out.println("FAILED");
            }
        }
    }

    static boolean check(String str) {
        return Pattern.matches("\\w{3,15}", str);
    }
}
