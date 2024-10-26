package practice.dogPark2;

import java.util.Random;

public enum Breed {
    BOXER (1),
    BOSTON_TERRIER (2),
    POODLE (3),
    BULLDOG (4),
    LABRADOODLE (5),
    CHIWAWA (6),
    GOLDEN_RETRIEVER (7);

    public final int label;

    public static Breed valueOfLabel(int label) {
        for (Breed breed : values()) {
            if (breed.label == label) {
                return breed;
            }
        }
        return null;
    }

    public static Breed getRandomBreed(){
        int randomBreedNum = new Random().nextInt(1,8);
        return valueOfLabel(randomBreedNum);
    }

    private Breed(int label) {
        this.label = label;
    }
}
