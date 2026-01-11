package java_basics;

import java.util.HashMap;
import java.util.Scanner;

public class ConditionalExamples {

    public static void main(String[] args) {

        /* EQUALITY & LOGICAL OPERATORS */

        // 6 is not equal to 3 + 4
        System.out.println("6 is not equal to 3 + 4? " + (6 != 3 + 4));

        // 8.146 is greater than or equal to 10
        System.out.println("8.146 is >= 10? " + (8.146 >= 10));

        // "Gandalf" is equal to "gandalf" if case-insensitive
        String uppercaseGandalf = "Gandalf";
        String lowercaseGandalf = "gandalf";
        // case-insensitive
        boolean upperEqualsLower = uppercaseGandalf.equalsIgnoreCase(lowercaseGandalf);
        System.out.println("'Gandalf' = 'gandalf'? " + upperEqualsLower);

        // 15 is greater than 10 AND is less than or equal to 20
        System.out.println("15 is > 10 AND <= 20? " + (15 > 10 && 15 <= 20));

        // "fellowship" contains the substring "boat" OR "ship"
        String string = "fellowship";
        boolean containsBoatOrShip = string.contains("boat") || string.contains("ship");
        System.out.println("'fellowship' contains the substring 'boat' OR 'ship'? " + containsBoatOrShip);


        /* IF, ELSE-IF, AND ELSE */

        Scanner scanner = new Scanner(System.in);

        // TODO: Store information about a noble in a map

        // Create a HashMap with String key and String value
        HashMap<String, String> noble = new HashMap<>();

        // Prompt the user for a name
        System.out.println("Enter the first name for a noble: ");
        String name = scanner.nextLine();

        // Declare a String, title, and initialize to null
        String title = null;

        // Construct a series of if/else-if/else blocks to initialize the title
        //   Eomer becomes King of Rohan
        //   Eowyn becomes Lady of Ithilien
        //   Aragorn becomes King of Gondor
        if (name.equalsIgnoreCase("Eomer")) {
            title = "King of Rohan";
        } else if (name.equalsIgnoreCase("Eowyn")) {
            title = "Lady of Ithilien";
        } else if (name.equalsIgnoreCase("Aragorn")) {
            title = "King of Gondor";
        } else {
            // edge-case if the name does not equal any of the above
            title = "Unknown";
        }

        // Store the name in the map
        // Set the title into the map
        noble.put(name, title);

        // Print the map
        System.out.println(noble);

        // Print a sentence using the noble's name and title
        // Character.toTitleCase = capitalizes the character at whatever index is provided
        // name.substring(1) = appends the remaining characters of the string after the prev character
        System.out.println("Noble: " + Character.toTitleCase(name.charAt(0)) + name.substring(1) + " | Title: " + title);

        // Don't close scanner yet


        /* SWITCH STATEMENTS */

        // TODO: Store information about a elf in a map

        // Create a HashMap with String key and String value
        HashMap<String, String> elf = new HashMap<>();

        // Prompt the user for a name
        System.out.println("Enter the first name for an elf: ");
        String elfName = scanner.nextLine();

        // Declare a String, realm, and initialize to null
        String realm = null;

        // Construct a switch statement to initialize the realm
        //   Legolas is from the Woodland Realm
        //   Elrond is from Rivendell
        //   Galadriel is from Lothlórien
        switch (elfName.toLowerCase()) {
            case "legolas":
                realm = "Woodland Realm";
                break;
            case "elrond":
                realm = "Rivendell";
                break;
            case "galadriel":
                realm = "Lothlórien";
                break;
            default:
                realm = "Unknown Realm";
        }

        // Store the name in the map
        // Set the realm into the map
        elf.put(elfName, realm);

        // Print the map
        System.out.println(elf);

        // Print a sentence using the elf's name and realm
        System.out.println(Character.toUpperCase(elfName.charAt(0)) + elfName.substring(1) + " from " + realm);

        scanner.close();

    }

}
