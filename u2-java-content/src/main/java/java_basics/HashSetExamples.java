package java_basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExamples {

    public static void main(String[] args) {

        /*
            A HashSet doesn't have key/value pairs like a HashMap.
            It is more like an ArrayList, but it does not allow duplicate elements.
            It also does not store its elements in any particular order (use a LinkedHashSet instead)
         */

        /* CREATING A HASHSET AND ADDING KEY/VALUE PAIRS */

        // TODO: Create an empty HashSet called numSet
        HashSet<Integer> numSet = new HashSet<>();

        // TODO: Add several numbers to the HashSet, including some duplicates
        numSet.add(3);
        numSet.add(24);
        numSet.add(8);
        numSet.add(12);
        numSet.add(3);
        numSet.add(65);
        numSet.add(1);
        numSet.add(8);

        // TODO: Print the HashSet to the console. What do you see?
        System.out.println(numSet); // no duplicate elements!


        /* REMOVING ELEMENTS FROM A HASHSET */

        // TODO: Remove one of the numbers and print it again
        numSet.remove(24);
        System.out.println(numSet);


        /* CHECKING FOR EXISTING ELEMENT */

        // TODO: Check to see if the HashSet contains certain numbers and print the result
        // Check both one you know is there and one you know is NOT
        System.out.println(numSet.contains(3)); // true
        System.out.println(numSet.contains(24)); // false


        /* LOOPING OVER ELEMENTS IN A HASHSET */

        // TODO: Iterate over the elements and print whether they're even or not
        //  (e.g. "The number 6 is even.")
        for (int num : numSet) {
            String evenText = num % 2 == 0 ? "even" : "not even";
            System.out.println("The number " + num + " is " + evenText + ".");
        }

        /* BONUS KNOWLEDGE: SORTING HASHSETS */

        // TODO: Convert the HashSet to an ArrayList
        //  then sort it with Collections.sort()
        //  then convert it back to a LinkedHashSet and print it
        ArrayList<Integer> numList = new ArrayList<>(numSet);
        Collections.sort(numList);
        LinkedHashSet<Integer> sortedNumSet = new LinkedHashSet<>(numList);
        System.out.println(sortedNumSet);
    }

}
