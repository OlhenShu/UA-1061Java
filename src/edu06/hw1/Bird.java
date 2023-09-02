package edu06.hw1;

abstract public class Bird {
    private String feathers;
    private int layEggs;


    private String name;


    public Bird(String name, String feathers, int layEggs) {
        this.name = name;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public String fly();
}
