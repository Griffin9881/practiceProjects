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
            for (Dog doggo : currentDogs) {
                if (!doggo.getTag().equals(dog.getTag())) {
                    this.currentDogs.add(dog);
                    System.out.println("Your dog has entered! There are currently " + currentDogs.size() + " dogs in the park!");
                } else {
                    System.out.println("Your dog is already in the park");
                }
            }
        } else {
            System.out.println("Sorry your dog can't come right now the dog park is full");
        }
    }

    public void removeDog(Dog dog) {
        int size = this.currentDogs.size();
        if (size > 0) {
            for(Dog doggo : currentDogs) {
                if (doggo.getTag().equals(dog.getTag())) {
                    this.currentDogs.remove(dog);
                    System.out.println("Your dog has left the park, there are now only " + currentDogs.size() + " in the park");
                }
            }
            if (size == currentDogs.size()) {
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
                iter.next();
                iter.remove();
            }
        }
    }

    public void listDogs() {
        for(Dog dog : this.currentDogs) {
            System.out.println(dog.toString());
        }
    }
} 
