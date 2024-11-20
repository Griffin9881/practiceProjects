package practice.dogPark.com.two.park.dog;

import java.util.Random;

import practice.dogPark.com.two.park.dog.models.Dog;
import practice.dogPark.com.two.park.dog.models.DogPark;
import practice.dogPark.com.two.park.dog.utilities.Breed;
import practice.dogPark.com.two.park.dog.utilities.DogNames;

public class Main {
    public static void main(String[] args) {
        DogPark boggyPark = new DogPark("Boggy's Park");
        DogPark kirbyPark = new DogPark("Kirby's Park", 100);

        boggyPark.openDogPark();
        kirbyPark.openDogPark();

        for (int i = 0; i < 49; i++) {
            boggyPark.addDog(new Dog(DogNames.getRandomNames(), Breed.getRandomBreed()));
        }

        for (int i = 0; i < 20; i++) {
            kirbyPark.addDog(new Dog(DogNames.getRandomNames(), Breed.getRandomBreed()));
        }

        System.out.println(boggyPark.getName() + " currently has " + boggyPark.getCurrentDogs().size() + " dogs out of a max " + boggyPark.getMaxCapacity());
        System.out.println(kirbyPark.getName() + " currently has " + kirbyPark.getCurrentDogs().size() + " dogs out of a max " + kirbyPark.getMaxCapacity());

        for (int i = 0; i < 5; i++) {
            int randomDeletion = new Random().nextInt(boggyPark.getCurrentDogs().size());
            Dog dogDeleted = null;
            for (Dog dog : boggyPark.getCurrentDogs()) {
                if (boggyPark.getCurrentDogs().indexOf(dog) == randomDeletion) {
                    dogDeleted = dog;
                }
            }
            boggyPark.removeDog(dogDeleted);
        }

        for (int i = 0; i < 15; i++) {
            int randomDeletion = new Random().nextInt(kirbyPark.getCurrentDogs().size());
            Dog dogDeleted = null;
            for (Dog dog : kirbyPark.getCurrentDogs()) {
                if (kirbyPark.getCurrentDogs().indexOf(dog) == randomDeletion) {
                    dogDeleted = dog;
                }
            }
            boggyPark.removeDog(dogDeleted);
        }

        System.out.println(boggyPark.getName() + " currently has " + boggyPark.getCurrentDogs().size() + " dogs");
        System.out.println(kirbyPark.getName() + " currently has " + kirbyPark.getCurrentDogs().size() + " dogs");

        boggyPark.closeDogPark();
        kirbyPark.closeDogPark();

        System.out.println(boggyPark.getName() + " currently has " + boggyPark.getCurrentDogs().size() + " dogs");
        System.out.println(kirbyPark.getName() + " currently has " + kirbyPark.getCurrentDogs().size() + " dogs");
    }
}
