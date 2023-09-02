package edu06.hw1;

public class App {
    private static Bird[] birds = {
            new Eagle("Eagle", "Black and white", 2),
            new Swallow("Swallow", "Black and white", 5),
            new Penguin("Penguin", "Black and white", 2),
            new Kiwi("Kiwi", "Brown", 1)
    };

    public static void main(String[] args) {
        for (Bird bird : birds) {
            System.out.println(
                    bird.getName()
                            + " | Feathers: " + bird.getFeathers()
                            + " | Lay egs: " + bird.getLayEggs()
                            + " | " + bird.fly()
            );
        }
    }
}
