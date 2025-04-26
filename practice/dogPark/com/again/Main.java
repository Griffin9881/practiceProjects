package dogPark.com.again;

public class Main {
    public static void main(String[] args) {
        DogPark laineysDogPark = new DogPark("Lainey's Dog Park", 100);
        DogPark griffinsDogPark = new DogPark("Griffin's Dog Park", 500); 

        System.out.println(laineysDogPark.getName() + " has a max capacity of " + laineysDogPark.getMaxCapacity());
        System.out.println(laineysDogPark.getName() + " has a current capacity of " + laineysDogPark.getCurrentCapacity());
        laineysDogPark.addDog();
        System.out.println(laineysDogPark.getName() + " has a current capacity of " + laineysDogPark.getCurrentCapacity());
        for(int i = 0; i < laineysDogPark.getMaxCapacity(); i++){
            laineysDogPark.addDog();
        }
        System.out.println(laineysDogPark.getName() + " has a current capacity of " + laineysDogPark.getCurrentCapacity());
        laineysDogPark.closeDogPark();
        System.out.println(laineysDogPark.getName() + " has a current capacity of " + laineysDogPark.getCurrentCapacity());
        }
}
