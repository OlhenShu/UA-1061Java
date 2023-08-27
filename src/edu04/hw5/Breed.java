package edu04.hw5;

public enum Breed {
    GOLDEN_RETRIEVER("Golden Retriever"),
    GERMAN_SHEPHERD("German Shepherd"),
    POODLE("Poodle"),
    BULLDOG("Bulldog"),
    ROTTWEILER("Rottweiler");
    private final String name;

    Breed(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
