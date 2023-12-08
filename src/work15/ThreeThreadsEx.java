package work15;

public class ThreeThreadsEx {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1 - Message " + (i + 1));
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2 - Message " + (i + 1));
            }
        });

        Thread thread3 = new Thread(() -> {
            try {
                thread1.join();
                thread2.join();

                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread 3 - Message " + (i + 1));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

