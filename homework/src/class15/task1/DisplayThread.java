package class15.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class DisplayThread implements Runnable {
    private String message;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Message is ".concat(message));
        }
    }

    public static void main(String[] args) {
        DisplayThread displayThread1 = new DisplayThread("1");
        DisplayThread displayThread2 = new DisplayThread("2");
        DisplayThread displayThread3 = new DisplayThread("3");

        Thread thread1 = new Thread(displayThread1);
        Thread thread2 = new Thread(displayThread2);
        Thread thread3 = new Thread(displayThread3);

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Something got interrupted");
        }
        thread3.start();

    }

}
