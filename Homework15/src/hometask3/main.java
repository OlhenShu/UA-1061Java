package hometask3;

public class main {
    public static void main(String[] args) {
        ThreadMessages threadMessages3 = new ThreadMessages("Thread three", 5);
        ThreadMessages threadMessages2 = new ThreadMessages("Thread two", 3, threadMessages3);
        ThreadMessages threadMessages1 = new ThreadMessages(threadMessages2);

        threadMessages1.start();
    }
}
