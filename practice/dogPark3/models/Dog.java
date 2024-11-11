package practice.dogPark3.models;

import java.util.UUID;

public abstract class Dog{
    private String name;
    private String breed;
    private UUID tag;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.tag = UUID.randomUUID();
    }

    public String getName() {
        if (name != null) {
            return name;
        } else {
            return "No Name";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        if (breed != null) {
            return this.breed;
        } else {
           return "No Breed";
        }
    }

    public UUID getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed + ", tag=" + tag +"]";
    }

}
