package edu15.hw2;

public class App {
    public static void main(String[] args) {
        final Object first = new Object();
        final Object second = new Object();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (first) {
                    try {
                        Thread.sleep(20);
                    } catch (Exception exception) {
                    }
                    synchronized (second) {
                        System.out.println("Success - first");
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (second) {
                    try {
                        Thread.sleep(100);
                    } catch (Exception exception) {
                    }
                    synchronized (first) {
                        System.out.println("Success - second");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
