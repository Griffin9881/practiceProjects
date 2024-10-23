package practice.dogPark1;

import java.util.ArrayList;
import java.util.ListIterator;

public class DogPark {
    private final int maxDogs;
    private ArrayList<Dog> currentDogs = new ArrayList<>();
    private boolean open;
    private String name;
    private String address;

    public DogPark(int maxDogs, String name, String address) {
        this.maxDogs = maxDogs;
        this.name = name;
        this.currentDogs.clear();
        this.open = false;
        this.address = address;
    }

    public DogPark(String name, String address) {
        this.maxDogs = 250;
        this.name = name;
        this.currentDogs.clear();
        this.open = false;
        this.address = address;
    }

    public DogPark(int maxDogs, String name) {
        this.maxDogs = maxDogs;
        this.name = "Dog Park";
        this.currentDogs.clear();
        this.open = false;
        this.address = "";
    }

    public DogPark(String name) {
        this.maxDogs = 250;
        this.name = name;
        this.currentDogs.clear();
        this.open = false;
        this.address = "";
    }

    public int getMaxDogs() {
        return this.maxDogs;
    }

    public int getCurrentDogs() {
        return this.currentDogs.size();
    }

    public boolean getOpen() {
        return open;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDog(Dog dog) {
        if (open) {
            boolean allowIn = true;
            if (this.currentDogs.size() < this.maxDogs) {
                for (Dog doggo : currentDogs) {
                    if (doggo.getTag().equals(dog.getTag())) {
                        allowIn = false;
                    }
                }
            if (allowIn) {
                this.currentDogs.add(dog);
                System.out.println("Your dog has entered! There are currently " + currentDogs.size() + " dogs in the park!");
            } else {
                System.out.println("Your dog is already in the park");
                    }
            } else {
                System.out.println("Sorry your dog can't come right now the dog park is full");
            }
        } else {
            System.out.println("The dog park is not open");
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
        open = false;
    }

    public void listDogs() {
        for(Dog dog : this.currentDogs) {
            System.out.println(dog.toString());
        }
    }

    public void openPark() {
        open = true;
    }
} 
