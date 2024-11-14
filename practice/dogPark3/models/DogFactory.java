package practice.dogPark3.models;

import practice.dogPark3.utilities.Breed;

public interface DogFactory {
    public Dog createDog(String name, Breed breed);
}