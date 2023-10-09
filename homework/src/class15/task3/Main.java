package class15.task3;

public class Main {
    public static void main(String[] args) {
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number 3");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number 2");
            }
            thread3.start();
        });

        Thread thread1 = new Thread(thread2::start);

        thread1.start();
    }
}
