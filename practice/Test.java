package practice;

public class Test extends App{
    public static void main(String[] args) {
            DogPark dogpark = new DogPark();
            Dog charlie = new Dog("Charlie", "Boston Terrier");
            dogpark.addDog(charlie);
            dogpark.addDog(charlie);
            System.out.println(dogpark.getCurrentDogs());
            dogpark.addDog(new Dog("Robert", "Chiwawa"));
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
