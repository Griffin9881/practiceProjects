package practice.dogPark.com.three.park.dog.models.subModels;

import practice.dogPark.com.three.park.dog.models.Dog;
import practice.dogPark.com.three.park.utilities.DogNames;
import practice.dogPark.com.three.park.dog.utilities.Breed;

public class Poodle extends Dog{
    public Poodle() {
        super(DogNames.getRandomNames(), Breed.POODLE);
    }

    public Poodle(String name) {
        super(name, Breed.POODLE);
    }
}
