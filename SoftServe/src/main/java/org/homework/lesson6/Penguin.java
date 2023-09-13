package org.homework.lesson6;

class Penguin extends NonFlyingBird {
    public Penguin(boolean feathers,
                   boolean layEggs
    ) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        super.fly();
    }
}
