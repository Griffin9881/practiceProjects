package practice.dogPark2.models;

import java.util.UUID;

import practice.dogPark2.utilities.Breed;

public class Dog {
    private String name;
    private Breed breed;
    private UUID tag;

    public Dog(String name, Breed breed) {
        this.name = name;
        this.breed = breed;
        this.tag = UUID.randomUUID();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public UUID getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed + ", tag=" + tag + "]";
    }
}
