package dogPark.com.again;

public class DogPark {
    private String name;
    private int maxCapacity;
    private int currentCapacity;

    public DogPark(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void addDog() {
        if(currentCapacity < maxCapacity) {
            currentCapacity += 1;
        }
    }

    public void removeDog() {
        if (currentCapacity > 0) {
            currentCapacity -= 1;
        }
    }

    public void closeDogPark() {
        while (currentCapacity > 0) {
            removeDog();
        }
    }
}
