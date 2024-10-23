package practice.dogPark2;

public class DogPark {
    private String name;
    private int maxCapacity;
    private int currentCapacity;

    DogPark(String name) {
        this.name = name;
        this.maxCapacity = 250;
        this.currentCapacity = 0;
    }

    DogPark(String name, int maxCapacity) {
        this.name = name;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The park is now named " + name);
    }

    public void addDog() {
        if (currentCapacity < maxCapacity) {
            currentCapacity++;
            System.out.println("Your dog has joined the park!");
        } else {
            System.out.println("The park is full your dog cannot join");
        }
    }

    public void removeDog() {
        if (currentCapacity > 0) {
            currentCapacity--;
            System.out.println("Your dog has left the park");
        } else {
            System.out.println("There are not dogs in the park");
        }
    }

    public void closeDogPark() {
        System.out.println("The dog park is now closed");
        while (currentCapacity > 0) {
            removeDog();
        }
    }
}
