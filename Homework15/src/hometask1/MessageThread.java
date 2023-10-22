package hometask1;

public class MessageThread extends Thread {
    private String message;
    private int numberOfMessages = 1;

    @Override
    public void run() {
        for (int i = 0; i < numberOfMessages; i++) {
            System.out.println(message);
        }
    }

    public MessageThread(String message, int numberOfMessages) {
        this.message = message;
        this.numberOfMessages = numberOfMessages;
    }
}
