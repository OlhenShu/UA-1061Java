package edu15.hw3;

public class App {

    public static void main(String[] args) {
        ThreadMessages threadMessages3 = new ThreadMessages("Thread number three", 5);
        ThreadMessages threadMessages2 = new ThreadMessages("Thread number two", 3, threadMessages3);
        ThreadMessages threadMessages1 = new ThreadMessages(threadMessages2);

        threadMessages1.start();
    }
}
