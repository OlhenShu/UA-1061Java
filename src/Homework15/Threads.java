package Homework15;

public class Threads {
    public static void magiin(String[] args) {
        Thread threadOne = new Thread(() -> {
            System.out.println("Thread number one");

            Thread threadTwo = new Thread(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Thread number two");
                }
            });

            Thread threadThree = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });

            threadTwo.start();
            threadThree.start();

            try {
                threadTwo.join();
                threadThree.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        threadOne.start();

        try {
            threadOne.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

