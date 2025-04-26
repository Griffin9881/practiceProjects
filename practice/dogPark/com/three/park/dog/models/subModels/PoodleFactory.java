package dogPark.com.three.park.dog.models.subModels;

import dogPark.com.three.park.dog.models.Dog;
import dogPark.com.three.park.dog.models.DogFactory;

public class PoodleFactory implements DogFactory {
    public PoodleFactory() {

    }
    
    @Override
    public Dog createDog(String name) {
        return new Poodle(name);
    }
}
