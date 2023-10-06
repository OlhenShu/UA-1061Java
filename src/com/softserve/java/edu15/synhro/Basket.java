package com.softserve.java.edu15.synhro;

public class Basket {
    private String fruit;
    private volatile boolean fruitIsAvailable = false; //volatile

    public synchronized String pushFruit() {
        while (!fruitIsAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Get: " + fruit);
        fruitIsAvailable = false;
        notify();
        return fruit;
    }

    public synchronized void putFruit(String fruit) {
        while (fruitIsAvailable) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.fruit = fruit;
        fruitIsAvailable = true;
        System.out.println("Put: " + fruit);
        notify();

    }
}