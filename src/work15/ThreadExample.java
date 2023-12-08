package work15;

public class ThreadExample {
    public static void main(String[] args) {
        Thread threadOne = new Thread(() -> {
            System.out.println("Thread number one");

            Thread threadTwo = new Thread(() -> {
                System.out.println("Thread number two");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two - Message " + (i + 1));
                }

                Thread threadThree = new Thread(() -> {
                    for (int j = 0; j < 5; j++) {
                        System.out.println("Thread number three - Message " + (j + 1));
                    }
                });

                threadThree.start();
                try {
                    threadThree.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            threadTwo.start();

            try {
                threadTwo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread number one finished");
        });

        threadOne.start();
    }
}
