package practice.dogPark.com.race.park.dog;

public class Main {
    public static void main(String[] args) {
        DogPark kirbyPark = new DogPark("Kirby Park");
        DogPark boggyPark = new DogPark("Boggy Park", 100);

        for (int i = 0; i < 49; i++) {
            kirbyPark.addDog();
        }

        for (int i = 0; i < 20; i++) {
            boggyPark.addDog();
        }

        System.out.println(kirbyPark.getName() + " has a current capacity of " + kirbyPark.getCurrentCapactity() + " out of a max of " + kirbyPark.getMaxCapacity());
        System.out.println(boggyPark.getName() + " has a current capacity of " + boggyPark.getCurrentCapactity() + " out of a max of " + boggyPark.getMaxCapacity());

        for (int i = 0; i < 5; i++) {
            kirbyPark.removeDog();
        }

        for (int i = 0; i < 15; i++) {
            boggyPark.removeDog();
        }

        System.out.println(kirbyPark.getName() + " has a current capacity of " + kirbyPark.getCurrentCapactity());
        System.out.println(boggyPark.getName() + " has a current capacity of " + boggyPark.getCurrentCapactity());        

        kirbyPark.closeDogPark();
        boggyPark.closeDogPark();
        
        System.out.println(kirbyPark.getName() + " has a current capacity of " + kirbyPark.getCurrentCapactity());
        System.out.println(boggyPark.getName() + " has a current capacity of " + boggyPark.getCurrentCapactity());        

    }
}
