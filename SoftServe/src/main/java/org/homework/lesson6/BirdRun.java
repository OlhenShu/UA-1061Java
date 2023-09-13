package org.homework.lesson6;

public class BirdRun {
    public static void main(String[] args) {

        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true,true);
        birds[1] = new Swallow(true,true);
        birds[2] = new Penguin(false,true);
        birds[3] = new Kiwi(true,true); {

            for (Bird bird : birds) {
                bird.fly();
                System.out.println("Feathers: " + bird.hasFeathers());
                System.out.println("Lays Eggs: " + bird.laysEggs());
                System.out.println();
            }

        }

    }
}
