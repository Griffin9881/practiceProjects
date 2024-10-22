package practice;

public class Test extends App{
    public static void main(String[] args) {
            PoodleFactory poodleFactory = new PoodleFactory();
            DogPark dogpark = new DogPark("Boggy Park");
            Dog charlie = poodleFactory.createDog("Charlie");
            dogpark.openPark();
            dogpark.setAddress("123 Maple Street");
            dogpark.addDog(charlie);
            dogpark.addDog(charlie);
            System.out.println(dogpark.getCurrentDogs());
            dogpark.addDog(poodleFactory.createDog("Robert"));
            dogpark.addDog(charlie);
            System.out.println(dogpark.getCurrentDogs());
            dogpark.removeDog(charlie);
            System.out.println(dogpark.getCurrentDogs());
            dogpark.addDog(charlie);
            System.out.println(dogpark.getCurrentDogs());
            dogpark.listDogs();

            dogpark.closeDogPark();
            System.out.println(dogpark.getCurrentDogs());
            dogpark.listDogs();
    }
}
