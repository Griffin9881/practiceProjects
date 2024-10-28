package practice.dogParkStep1;

public class Main {
    public static void main(String[] args) {
        DogPark davidDogPark = new DogPark("David's Dog Park");
        DogPark griffinDogPark = new DogPark("Griffin's Dog Park", 500);

        for (int i = 0; i < 49; i++) {
            davidDogPark.addDog();
        }

        for (int i = 0; i < 20; i++) {
            griffinDogPark.addDog();
        }

        System.out.println(davidDogPark.getName() + " has a current capasity of " + davidDogPark.getCurrentCapcity() + " out of a max of " + davidDogPark.getMaxCapacity());
        System.out.println(griffinDogPark.getName() + "has a current capacity of " + griffinDogPark.getCurrentCapcity() + " out of a max of " + griffinDogPark.getMaxCapacity());

        for (int i = 0; i < 5; i++) {
            davidDogPark.removeDog();
        }
        for (int i = 0; i < 15; i++) {
            griffinDogPark.removeDog();
        }

        System.out.println(davidDogPark.getName() + " currently has " + davidDogPark.getCurrentCapcity() + " dogs");
        System.out.println(griffinDogPark.getName() + " currently has " + griffinDogPark.getCurrentCapcity() + " dogs");

        davidDogPark.closeDogPark();
        griffinDogPark.closeDogPark();

        System.out.println(davidDogPark.getName() + " currently has " + davidDogPark.getCurrentCapcity() + " dogs");
        System.out.println(griffinDogPark.getName() + " currently has " + griffinDogPark.getCurrentCapcity() + " dogs");
    }
}
