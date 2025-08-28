package concept_reviews.part_1;

import java.util.HashMap;

public class ArraysAndCollections {

    /* ARRAYS */

    public static void printDesserts() {

        // Declare an empty array of four strings called favoriteDesserts.
        String[] favoriteDesserts = new String[4];

        // Add your 4 favorite desserts one at a time to the array
        favoriteDesserts[0] = "dark chocolate covered pretzels";
        favoriteDesserts[1] = "dark chocolate cherry ice cream";
        favoriteDesserts[2] = "chocolate cheesecake";
        favoriteDesserts[3] = "apple pie";

        // Make use of a for-each loop to print something like this:
        /*
            My top 3 desserts:
              - dark chocolate covered pretzels
              - dark chocolate cherry ice cream
              - chocolate cheesecake
              - apple pie
         */
        System.out.println("\nMy top 3 desserts:");
        for (String dessert : favoriteDesserts) {
            System.out.println("  - " + dessert);
        }
    }


    /* COLLECTIONS */

    public static void printSeasonsAndReasons() {

        // Choose a collection type to store the four seasons of the year
        //  along with your favorite thing about each season.
        HashMap<String, String> seasonsAndReasons = new HashMap<>();

        seasonsAndReasons.put("Winter", "watching snow softly falling on a quiet day");
        seasonsAndReasons.put("Spring", "seeing those first few bursts of color out of the ground after a long, gray winter");
        seasonsAndReasons.put("Summer", "enjoying the long hours of daylight");
        seasonsAndReasons.put("Fall", "driving through the mountains, surrounded by brilliant reds and golds");

        // Print a series of sentences with the information on each season.
        //  Refactor your data if needed to fit the sentence format.
        for (String season : seasonsAndReasons.keySet()) {
            String reason = seasonsAndReasons.get(season);
            System.out.println("\nMy favorite thing about " + season + " is " + reason + ".");
        }
    }

}
