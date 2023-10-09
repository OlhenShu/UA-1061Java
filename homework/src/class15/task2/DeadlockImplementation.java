package class15.task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeadlockImplementation {
    public static void main(String[] args) {
        final Object object1 = new Object();
        final Object object2 = new Object();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (object1) {
                    System.out.println("Thread1 before synchronized statement");
                    synchronized (object2) {
                        System.out.println("Thread 1 after synchronized statement");
                    }
                }
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                synchronized (object2) {
                    System.out.println("Thread2 before synchronized statement");
                    synchronized (object1) {
                        System.out.println("Thread2 after synchronized statement");
                    }
                }
            }
        };

        thread1.start();
        thread2.start();
    }
}
