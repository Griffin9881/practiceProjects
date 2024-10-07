package practice;

public class DogPark {
    private int maxDogs = 250;
    private int currentDogs;

    public DogPark(int maxDogs) {
        this.maxDogs = maxDogs;
        this.currentDogs = 0;
    }

    public DogPark() {
        this.currentDogs = 0;
    }

    public int getMaxDogs() {
        return this.maxDogs;
    }

    public int getCurrentDogs() {
        return this.currentDogs;
    }

    public void addDog() {
        if (this.currentDogs < this.maxDogs) {
            this.currentDogs++;   
        } else {
            System.out.println("Sorry your dog can't come right now the dog park is full");
        }
    }

    public void removeDog() {
        if (this.currentDogs > 0) {
            this.currentDogs--;
        } else {
            System.out.println("Sorry there is no dog to remove from the park");
        }
    }
}
