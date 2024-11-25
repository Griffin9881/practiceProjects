package practice.dogPark.com.race.park.dog;

public class DogPark {
    private int currentCapactity;
    private int maxCapacity;
    private String name;

    public DogPark(String name) {
        this.name = name;
        this.maxCapacity = 50;
        this.currentCapactity = 0;
    }

    public DogPark(String name, int maxCapacity) {
        this(name);
        this.maxCapacity = maxCapacity;
    }

    public void addDog() {
        if (currentCapactity < maxCapacity) {
            currentCapactity++;
        }
    }

    public void removeDog() {
        if (currentCapactity > 0) {
            currentCapactity--;
        }
    }

    public void closeDogPark() {
        while (currentCapactity > 0) {
            removeDog();
        }
    }

    public int getCurrentCapactity() {
        return this.currentCapactity;
    }

    public int getMaxCapacity() {
        return this.maxCapacity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
