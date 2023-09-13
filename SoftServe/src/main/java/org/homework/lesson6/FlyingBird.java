package org.homework.lesson6;

class FlyingBird extends Bird {
    public FlyingBird(
            boolean feathers,
            boolean layEggs) {

        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This flying bird is flying.");
    }
}
