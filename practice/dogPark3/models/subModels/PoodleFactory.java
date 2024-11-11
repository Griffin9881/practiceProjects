package practice.dogPark3.models.subModels;

import practice.dogPark3.models.Dog;
import practice.dogPark3.models.DogFactory;

public class PoodleFactory implements DogFactory {
    public PoodleFactory() {

    }
    
    @Override
    public Dog createDog(String name) {
        return new Poodle(name);
    }
}
