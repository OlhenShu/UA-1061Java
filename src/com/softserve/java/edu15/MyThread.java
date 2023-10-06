package com.softserve.java.edu15;

//public class MyThread extends Thread {
//    @Override
//    public void run() {
//        int sum = 0;
//        for (int i = 0; i < 10000; i++) {
//            sum += i;
//        }
//        System.out.println("Sum numbers from 0 to 1000 is " + sum);
//    }
//
//    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start();
//    }
//}
public class MyThread extends Thread {
    private int number;
    private int pause;

    public MyThread(int number, int pause) {
        this.number = number;
        this.pause = pause;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
            }
            System.out.println("Thread " + number);
        }
    }
}

class Example {
    public static void main(String[] args) throws Exception {
        Thread t1 = new MyThread(1, 100);
        Thread t2 = new MyThread(2, 250);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread main");
    }
}


