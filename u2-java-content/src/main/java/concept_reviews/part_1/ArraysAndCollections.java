package concept_reviews.part_1;

import java.util.HashMap;
import java.util.Map;

public class ArraysAndCollections {

    public static void main(String[] args) {
        printDesserts();
        printSeasonsAndReasons();
    }

    /* ARRAYS */

    public static void printDesserts() {

        // Declare an empty array of four strings called favoriteDesserts.
        String[] favoriteDesserts = new String[4];

        // Add your 4 favorite desserts one at a time to the array
        favoriteDesserts[0] = "Ice Cream";
        favoriteDesserts[1] = "Sticky Toffee Pudding";
        favoriteDesserts[2] = "Chocolate Chip Cookies";
        favoriteDesserts[3] = "Apple Pie";

        // Make use of a for-each loop to print something like this:
        /*
            My top 3 desserts:
              - dark chocolate covered pretzels
              - dark chocolate cherry ice cream
              - chocolate cheesecake
              - apple pie
         */
        System.out.println("My top 4 desserts:");
        for (String dessert : favoriteDesserts) {
            System.out.println("- " + dessert);
        }
    }


    /* COLLECTIONS */

    public static void printSeasonsAndReasons() {

        // Choose a collection type to store the four seasons of the year
        // along with your favorite thing about each season.
        HashMap<String, String> seasons = new HashMap<>();
        seasons.put("Spring", "Nature awakens with blooming flowers and warming temperatures after winter's sleep.");
        seasons.put("Summer", "Long, sunny days perfect for beach trips, barbecues, and outdoor adventures.");
        seasons.put("Fall", "Crisp air and vibrant foliage create a cozy atmosphere as the year winds down.");
        seasons.put("Winter", "Cold weather brings snowfall, holidays, and opportunities for indoor comfort and winter sports.");

        // Print a series of sentences with the information on each season.
        // Refactor your data if needed to fit the sentence format.
        for (Map.Entry<String, String> season : seasons.entrySet()) {
            String key = season.getKey();
            String value = season.getValue();

            System.out.println("In " + key + ": " + value);

        }
    }
}