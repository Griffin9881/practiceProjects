package practice.dogPark1;

public class Poodle extends Dog{
    public Poodle() {
        super("Poodle");
    }

    public Poodle(String name) {
        super("Poodle", name);
    }

    @Override
    public String getBreed() {
        return "Poodle";
    }
}
