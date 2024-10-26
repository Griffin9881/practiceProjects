package practice.dogPark2.models;

import java.util.ArrayList;
import java.util.ListIterator;

public class DogPark {
    private String name;
    private int maxCapacity;
    private ArrayList<Dog> currentDogs = new ArrayList<>();
    private boolean isOpen;

    public DogPark(String name) {
        this.name = name;
        this.maxCapacity = 250;
        this.currentDogs.clear();
        this.isOpen = false;
    }

    public DogPark(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentDogs.clear();
        this.isOpen = false;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The park is now named " + name);
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public ArrayList<Dog> getCurrentDogs() {
        return this.currentDogs;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public void addDog(Dog dog) {
        if (isOpen) {
            if (currentDogs.size() < maxCapacity) {
                if (!currentDogs.contains(dog)) {
                    currentDogs.add(dog);
                }
            } 
        }
    }

    public void removeDog(Dog dog) {
        if (currentDogs.size() > 0) {
            if (currentDogs.contains(dog)) {
                currentDogs.remove(dog);
            }
        }
    }

    public void openDogPark() {
        isOpen = true;
    }

    public void closeDogPark() {
        isOpen = false;
        ListIterator<Dog> iter = currentDogs.listIterator();
        while (iter.hasNext()) {
            iter.next();
            iter.remove();
        }
    }
}
