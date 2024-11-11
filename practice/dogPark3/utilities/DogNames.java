package practice.dogPark3.utilities;

import java.util.Random;

public class DogNames {
    private static final String[] NAMES = {"Meta Knight", "Kirby", "Waddle Dee", "King DeDeDe", "Elfilin", "Boggy", "Rosamund", "Murat", "Jeffery", "VioLinda"};

    public DogNames() {
    }

    public static String getRandomNames(){
        int randomNameNum = new Random().nextInt(NAMES.length);
        return NAMES[randomNameNum];
    }
}
