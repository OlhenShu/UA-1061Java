package Homework6;

import java.lang.reflect.Array;

public abstract class Bird {
    private String feathers;
    private int layEggs;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public abstract void fly();
    public abstract String getBirdInfo();
    public abstract String getName();

    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle();
        birds[1] = new Swallow();
        birds[2] = new Penguin();
        birds[3] = new Kiwi();

        for (Bird bird : birds) {
            bird.fly();
            System.out.println("Bird info: " + bird.getName() + bird.getBirdInfo());


        }
    }
}