package concept_reviews.part_1;

/*
    NOTE: If you are working in pairs or groups, each person should take turns coming up with the words and data types below!
 */

public class DataTypes {

    // TODO: Declare private, static variables (each with an appropriate type) that have
    //  fun/interesting values for the following:

    // 0: nonsense word to substitute for an object you don't recall the name of, capitalized
    private static String nonsenseWord = "Whatchamacallit";

    // 1: quirky present-tense motion verb (e.g., "amble" or "leapfrog")
    private static String motionVerb = "cartwheel";

    // 2: a first name you would never in a million years choose for your child
    private static String firstName = "Griselda";

    // 3: name of a famous woman from a history book
    private static String famousWoman = "Ada Lovelace";

    // 4: a metal object
    private static String metalObject = "staple";

    // 5: a wooden object
    private static String woodenObject = "grandfather clock";

    // 6: a very large number
    private static int largeNumber = 1000006;

    // 7: a verb ending in -ing
    private static String ingVerb = "catapulting";

    // 8: a kitchen utensil
    private static String kitchenUtensil = "soup ladle";

    // 9: the year, make & model of a car
    private static String car = "1991 Toyota Corolla";

    // 10: a slimy, oozing substance
    private static String slimySubstance = "snot";

    // 11: a shiny object
    private static String shinyObject = "cubic zirconia earring";

    // 12: something colorful
    private static String colorfulObject = "rainbow scarf";

    // 13: a texture (e.g., "crunchy", "fluffy")
    private static String texture = "prickly";

    // 14: an alien planet
    private static String alienPlanet = "Tatooine";

    // 15: your favorite high school teacher
    private static String faveHSTeacher = "Jody Anderson";

    // 16: a strong emotion (e.g., "despair" or "elation")
    private static String strongEmotion = "overwhelm";

    // 17: a number greater than 10
    private static int numAbove10 = 42;

    // 18: a fruit (plural)
    private static String fruit = "boysenberries";

    // 19: a superlative (adjective ending in -est)
    private static String superlative = "crunchiest";


    // GOT THEM ALL? Good! Now you can move on.

    private static final Object[] words = {nonsenseWord, motionVerb, firstName, famousWoman, metalObject, woodenObject, largeNumber, ingVerb, kitchenUtensil, car, slimySubstance, shinyObject, colorfulObject, texture, alienPlanet, faveHSTeacher, strongEmotion, numAbove10, fruit, superlative};





    /*************************************************************************************
     NOTE: DO NOT PEEK BELOW UNTIL *AFTER* YOU HAVE INITIALIZED ALL THE VARIABLES ABOVE!
    **************************************************************************************/

    public static void printStory() {

        String newline = System.lineSeparator();

        System.out.println("The " + words[0] + newline);

        System.out.println("On a cool autumn afternoon, a blustery wind was making leaves " + words[1] + " along the path as young " + words[2] + " walked home from school. Just as the bubbling " + words[3] + " Creek came into sight, a strangely-shaped object caught " + words[2] + "'s eye. From a distance, it looked at first to be a bent " + words[4] + " or perhaps even a broken " + words[5] + "." + newline);

        System.out.println("Although Mother said it was important to come straight home from school in order to get chores done before dinner, " + words[2] + " stepped off the path and walked steadily toward the object, an insatiable curiosity taking over. Surely this was more interesting than washing " + words[6] + " loads of laundry and " + words[7] + " putting away the clean dishes!" + newline);

        System.out.println("Upon reaching the mysterious object, " + words[2] + " was flummoxed. What could it possibly be? Was it some kind of " + words[8] + "? It was also possible that it was a long-lost part from a vintage " + words[9] + "! " + words[2] +  " decided to take it home. But UGH! It was covered in " + words[10] + ". Gross." + newline);

        System.out.println(words[2] + " carried it quickly over to the creek and washed the disgusting goo from the strange item. It seemed much brighter now, shiny like a " + words[11] + " and the color of a " + words[12] + ". " + words[2] + " scrambled across the dry, " + words[13] + " leaves and skipped down the path toward home." + newline);

        System.out.println("Clambering noisily through the back door as children often do, " + words[2] + " yelled, \"Moooommmmm! Come see what I found!\"" + newline);

        System.out.println(words[2] + "'s older sister came around the corner and yelled, \"Where on " + words[14] + " have you been? And what in the name of " + words[15] + " is that thing?!?\" Her face was all twisted up with an unmistakable expression of " + words[16] + "." + newline);

        System.out.println("\"I don't know,\" said " + words[2] + ", plunking the object down and grabbing " + words[17] + " " + words[18] + ". \"I'm going to ask Mom. Where is she, anyway?\"" + newline);

        System.out.println("\"Here I am!\" " + words[2] + "'s mother came into the room and let out a burst of laughter as soon as she saw what was on the kitchen counter. \"Oh, my child - you bring home the " + words[19] + " things! Where did you find that old rotary telephone, anyway?\"" + newline);

        System.out.println("THE END" + newline);
    }
}
