package edu15.hw1;

public class App {
    public static void main(String[] args) {
        MessageThread message1 = new MessageThread("Message Thread 1", 10);
        MessageThread message2 = new MessageThread("Message Thread 2", 10);
        MessageThread message3 = new MessageThread("Message Thread 3", 10);

        message1.start();
        message2.start();
        try {
            message1.join();
            message2.join();
        } catch (InterruptedException exception) {
        }
        message3.start();
    }
}
