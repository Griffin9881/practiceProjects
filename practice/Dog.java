package practice;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Dog() {
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
}
