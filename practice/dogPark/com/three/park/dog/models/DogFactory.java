package dogPark.com.three.park.dog.models;

import dogPark.com.three.park.dog.utilities.Breed;

public interface DogFactory {
    public Dog createDog(String name, Breed breed);
}