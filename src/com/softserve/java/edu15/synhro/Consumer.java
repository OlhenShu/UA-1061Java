package com.softserve.java.edu15.synhro;

public class Consumer implements Runnable {
    Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            basket.pushFruit();
        }
    }
}
