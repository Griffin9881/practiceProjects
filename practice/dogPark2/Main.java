package practice.dogPark2;

public class Main {
    public static void main(String[] args) {
        DogPark boggyPark = new DogPark("Boggy's Park");
        DogPark kirbyPark = new DogPark("Kirby's Park", 100);

        for (int i = 0; i < 49; i++) {
            boggyPark.addDog();
        }

        for (int i = 0; i < 20; i++) {
            kirbyPark.addDog();
        }

        System.out.println(boggyPark.getName() + " currently has " + boggyPark.getCurrentCapacity() + " dogs out of a max " + boggyPark.getMaxCapacity());
        System.out.println(kirbyPark.getName() + " currently has " + kirbyPark.getCurrentCapacity() + " dogs out of a max " + kirbyPark.getMaxCapacity());

        for (int i = 0; i < 5; i++) {
            boggyPark.removeDog();
        }

        for (int i = 0; i < 15; i++) {
            kirbyPark.removeDog();
        }

        System.out.println(boggyPark.getName() + " currently has " + boggyPark.getCurrentCapacity() + " dogs");
        System.out.println(kirbyPark.getName() + " currently has " + kirbyPark.getCurrentCapacity() + " dogs");

        boggyPark.closeDogPark();
        kirbyPark.closeDogPark();

        System.out.println(boggyPark.getName() + " currently has " + boggyPark.getCurrentCapacity() + " dogs");
        System.out.println(kirbyPark.getName() + " currently has " + kirbyPark.getCurrentCapacity() + " dogs");
    }
}
