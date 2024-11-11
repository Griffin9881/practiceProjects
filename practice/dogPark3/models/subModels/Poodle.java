package practice.dogPark3.models.subModels;

import practice.dogPark2.utilities.DogNames;
import practice.dogPark3.models.Dog;

public class Poodle extends Dog{
    public Poodle() {
        super(DogNames.getRandomNames(), "Poodle");
    }

    public Poodle(String name) {
        super(name, "Poodle");
    }

    @Override
    public String getBreed() {
        return "Poodle";
    }
}
