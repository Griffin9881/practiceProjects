package practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class DogPark {
    private int maxDogs = 250;
    private ArrayList<Dog> currentDogs = new ArrayList<>();

    public DogPark(int maxDogs) {
        this.maxDogs = maxDogs;
        this.currentDogs.clear();
    }

    public DogPark() {
        this.currentDogs.clear();
    }

    public int getMaxDogs() {
        return this.maxDogs;
    }

    public int getCurrentDogs() {
        return this.currentDogs.size();
    }

    public void addDog(Dog dog) {
        if (this.currentDogs.size() < this.maxDogs) {
            if (!currentDogs.contains(dog)) {
                this.currentDogs.add(dog);
            } else {
                System.out.println("Your dog is already in the park");
            }
        } else {
            System.out.println("Sorry your dog can't come right now the dog park is full");
        }
    }

    public void removeDog(Dog dog) {
        if (this.currentDogs.size() > 0) {
            if (this.currentDogs.contains(dog)) {
                this.currentDogs.remove(dog);
            } else {
                System.out.println("Your dog is not in the park");
            }
        } else {
            System.out.println("Sorry there is no dog to remove from the park");
        }
    }

    public void closeDogPark() {
        if (this.currentDogs.size() > 0) {
            ListIterator<Dog> iter = currentDogs.listIterator();
            while(iter.hasNext()){
                currentDogs.remove(iter.nextIndex());
            }
        }
    }
} 
