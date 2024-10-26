package practice.dogPark2.utilities;

import java.util.Random;

public class DogNames {
    private static final String[] names = {"Meta Knight", "Kirby", "Waddle Dee", "King DeDeDe", "Elfilin", "Boggy", "Rosamund", "Murat", "Jeffery", "VioLinda"};

    public DogNames() {
    }

    public static String getRandomNames(){
        int randomNameNum = new Random().nextInt(10);
        return names[randomNameNum];
    }
}
