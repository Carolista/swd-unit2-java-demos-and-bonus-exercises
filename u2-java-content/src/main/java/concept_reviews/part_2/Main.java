package concept_reviews.part_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /* THE VEGETABLE CLASS */

        // Instantiate several Vegetable objects below.
        Vegetable greenBellPepper = new Vegetable("Bell Pepper", "green", 3.2);
        Vegetable redBellPepper = new Vegetable("Bell Pepper", "red", 5.1);
        Vegetable carrot = new Vegetable("Carrot", "orange", 2.5);
        Vegetable rutabaga = new Vegetable("Rutabaga", "yellow and purple", 46.2);
        Vegetable broccoli = new Vegetable("Broccoli", "green", 13.7);

        // Place the objects into an iterable data structure and
        //  use a for-each loop to print each one in turn.
        Vegetable[] veggies = {greenBellPepper, redBellPepper, carrot, rutabaga, broccoli};

        for (Vegetable veggie : veggies) {
            System.out.println(veggie); // implicitly calls .toString()
        }


        /* THE FURNITURE CLASS */

        // Instantiate several Furniture objects below.
        Furniture dresser = new Furniture("Dresser", "Broyhill", "Bedroom", 30, 60, 18, false, new String[]{"walnut", "steel"});
        Furniture headboard = new Furniture("Headboard", "Broyhill", "Bedroom", 48, 60, 3, false, new String[]{"walnut"});
        Furniture nightstand = new Furniture("Nightstand", "Broyhill", "Bedroom", 24, 18, 20, false, new String[]{"walnut"});

        // Place the objects into an iterable data structure and
        //  use a for-each loop to print each one in turn.
        ArrayList<Furniture> furnitureList = new ArrayList<>(Arrays.asList(dresser, headboard, nightstand));

        for (Furniture furniturePiece : furnitureList) {
            System.out.println(furniturePiece); // implicitly calls .toString()
        }
    }
}
