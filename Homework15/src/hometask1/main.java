package hometask1;

public class main {
    public static void main(String[] args) {
        MessageThread message1 = new MessageThread("Message one:", 5);
        MessageThread message2 = new MessageThread("Message two:", 5);
        MessageThread message3 = new MessageThread("Message three", 5);

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
