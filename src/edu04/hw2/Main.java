package edu04.hw2;

public class Main {
    public static void main(String[] args) {
        Number number = new Number(Number.getEnteredNumber("Input First number"));
        number.setNumber(Number.getEnteredNumber("Input Second number"))
                .setNumber(Number.getEnteredNumber("Input Last number"));

        Number.printResult();
    }
}
