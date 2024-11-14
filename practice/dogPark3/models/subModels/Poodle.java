package practice.dogPark3.models.subModels;

import practice.dogPark3.utilities.DogNames;
import practice.dogPark3.models.Dog;
import practice.dogPark3.utilities.Breed;

public class Poodle extends Dog{
    public Poodle() {
        super(DogNames.getRandomNames(), Breed.POODLE);
    }

    public Poodle(String name) {
        super(name, Breed.POODLE);
    }
}
