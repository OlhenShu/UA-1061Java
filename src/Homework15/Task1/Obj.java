package Homework15.Task1;

class Obj implements Runnable {
    private String threadName;
    private String message;
    private int times;

    public Obj (String threadName, String message, int times) {
        this.threadName = threadName;
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(threadName + ": " + message);
        }
    }
}