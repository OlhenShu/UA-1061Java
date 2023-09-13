package org.homework.lesson6;

public class DeveloperRun {
    public static void main(String[] args) {
        Developer developer = new Developer(
                "name1",
                32,
                32735.35,
                "position1"
        );

        System.out.println(developer.report());

    }

}
