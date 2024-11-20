package practice.dogPark.com.three.park.dog.models;

import java.util.UUID;

import practice.dogPark.com.three.park.dog.utilities.Breed;

public abstract class Dog{
    private String name;
    private Breed breed;
    private UUID tag;

    public Dog(String name, Breed breed) {
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

    public Breed getBreed() {
        return this.breed;
    }

    public UUID getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed.label + ", tag=" + tag +"]";
    }

}
