package practice.dogPark1;

public class PoodleFactory implements DogFactory {
    public PoodleFactory() {

    }
    
    @Override
    public Dog createDog(String name) {
        return new Poodle(name);
    }
}
