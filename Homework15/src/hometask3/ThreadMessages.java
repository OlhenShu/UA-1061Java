package hometask3;

public class ThreadMessages extends Thread {

    private String message = null;
    private int numberOfMessages = 1;

    private Thread nextThread = null;

    @Override
    public void run() {
        if (message != null) {
            for (int i = 0; i < numberOfMessages; i++) {
                System.out.println(message);
            }
        }
        if (nextThread != null) {
            nextThread.start();
        }
    }

    public ThreadMessages(String message, int numberOfMessages) {
        this.message = message;
        this.numberOfMessages = numberOfMessages;
    }

    public ThreadMessages(String message, int numberOfMessages, Thread nextThread) {
        this.message = message;
        this.numberOfMessages = numberOfMessages;
        this.nextThread = nextThread;
    }

    public ThreadMessages(Thread nextThread) {
        this.nextThread = nextThread;
    }
}
