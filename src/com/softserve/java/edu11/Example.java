package com.softserve.java.edu11;

import java.util.Arrays;
import java.util.Locale;

public class Example {
    public static void main(String[] args) {
        String lowerCase = "lowwer";
        String upperCase = "UPPER";
        System.out.println(toTitleCase(lowerCase).equals("Lower"));
        System.out.println(toTitleCase(upperCase).equals("Upper"));

        String str = Arrays.toString(lowerCase.split("w"));
        System.out.println(str);




        String str1 = "Java";
        String str2 = new String("Java").intern();
        System.out.println(str1 == str2);

        String name = "Olha";
        int age = 32;
        String message = /*String.format("Name: %s, Age: %d", name, age);*/
                """
                        Name: %s;
                        Age: %d;
                        """.formatted(name, age);

        System.out.println(message);

        Locale.setDefault(Locale.ROOT);
        var s = "PI = %.2f".formatted(3.1415);
        System.out.println(s);

        System.out.println(new StringBuffer(name).reverse());

        String block = """
                sfargerg \
                sgaergseg
                    rgghearheshe
                """;
        System.out.println(block);
    }

    static String toTitleCase(String s) {
//        return s.substring(0, 1).toUpperCase(Locale.ROOT)
//                + s.substring(1).toLowerCase(Locale.ROOT);

        return Character.toTitleCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
}
