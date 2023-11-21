package ConditionStatements.Task5;

import ConditionStatements.Task3.HTTPError;

public enum Breed {
    BEAGLE("The beagle is a breed of small scent hound, similar in appearance to the much larger foxhound."),
    BULLDOG("The Bulldog is a British breed of dog of mastiff type."),
    HUSKY("The Husky is a medium-sized working sled dog breed. The breed belongs to the Spitz genetic family."),
    MALAMUTE("The Malamute is a large breed of dog that was originally bred for its strength and endurance, to haul heavy freight as a sled dog, and as a hound"),
    DALMATIAN("The Dalmatian is a breed of dog, which has a white coat marked with black or brown-coloured spots.");

    private final String description;
    Breed (String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Breed getBreedInfo(String breed) {
        return switch (breed.toLowerCase()) {
            case "beagle" -> Breed.BEAGLE;
            case "bulldog" ->  Breed.BULLDOG;
            case "husky" -> Breed.HUSKY;
            case "malamute" -> Breed.MALAMUTE;
            case "dalmatian" -> Breed.DALMATIAN;

            default -> null;

        };
    }

}
