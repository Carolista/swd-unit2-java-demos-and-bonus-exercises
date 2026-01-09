package java_basics;

import java.util.Arrays;

public class ArrayExamples {

    public static void main(String[] args) {

        /* DECLARING AN EMPTY ARRAY */

        // Declare an empty Array, hobbits, that can hold 8 elements of type String
        String[] hobbits = new String[8];

        // Add 4 Hobbits at different indices
        hobbits[0] = "Bjorn";
        hobbits[3] = "Gion";
        hobbits[5] = "Balin";
        hobbits[7] = "Smaug";

        // Print an element at an index with an unassigned value
        System.out.println(hobbits[1]); // output: null

        // Print the array by name — what happens?
        System.out.println(hobbits); // output: memory address for hobbits ([Ljava.lang.String;@1d81eb93)

        // Use ArrayExamples.toString() to print the array's contents
        System.out.println(Arrays.toString(hobbits));
        // output: [Bjorn, null, null, Gion, null, Balin, null, Smaug]


        /* INITIALIZING AN ARRAY WITH VALUES */

        // Declare an array of integers, fellowship, representing the members of the Fellowship
        // wizards, hobbits, elves, dwarves, men
        int[] fellowship = {1, 4, 1, 1, 2};

        // Print a sentence with the number of men
        System.out.println("Total number of men in the fellowship: " + fellowship[4]);

        // Print the array elements using ArrayExamples.toString()
        System.out.println(Arrays.toString(fellowship));
        // output: [1, 4, 1, 1, 2]
    }

}
