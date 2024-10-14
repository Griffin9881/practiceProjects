package practice;

import java.util.Random;

public class Dog {
    private String name;
    private String breed;
    private String tag;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        assignNewTag();
    }

    public Dog(String breed) {
        this.breed = breed;
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

    public void assignNewTag() {
        Random random = new Random();
        Double randomNum = random.nextDouble(1000000);
        if (this.name != null) {
            tag = name+"_"+breed+"_"+randomNum;
        } else {
            tag = breed+"_"+randomNum;
        }
    }

    public String getTag() {
        return tag;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", breed=" + breed + ", tag=" + tag +"]";
    }

}
