package Homework15.Task1;

import Homework15.Task1.Obj;

public class ThreeThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Obj("Thread 1", "Message 1", 2));
        Thread thread2 = new Thread(new Obj("Thread 2", "Message 2",5 ));
        Thread thread3 = new Thread(new Obj("Thread 3", "Message 3", 1));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread3.start();
    }
}


