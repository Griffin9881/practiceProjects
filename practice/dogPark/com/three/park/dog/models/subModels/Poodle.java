package practice.dogPark.com.three.park.dog.models.subModels;

import practice.dogPark.com.three.park.dog.utilities.DogNames;
import practice.dogPark.com.three.park.dog.models.Dog;
import practice.dogPark3.utilities.Breed;

public class Poodle extends Dog{
    public Poodle() {
        super(DogNames.getRandomNames(), Breed.POODLE);
    }

    public Poodle(String name) {
        super(name, Breed.POODLE);
    }
}
