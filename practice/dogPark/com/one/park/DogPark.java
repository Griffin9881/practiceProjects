package practice.dogPark.com.one.park;

public class DogPark {
    private String name;
    private int maxCapacity;
    private int currentCapcity;

    public DogPark(String name) {
        this.name = name;
        this.maxCapacity = 250;
        this.currentCapcity = 0;        
    }

    public DogPark(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentCapcity = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public int getCurrentCapcity() {
        return this.currentCapcity;
    }

    public void addDog() {
        if (currentCapcity < maxCapacity) {
            currentCapcity++;
        }
    }

    public void removeDog() {
        if (currentCapcity > 0) {
            currentCapcity--;
        }
    }

    public void closeDogPark() {
        while (currentCapcity > 0) {
            currentCapcity--;
        }
    }
}
