package java_basics;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        /* DECLARING ARRAYLISTS */

        // elves ArrayList, for data of type String
        ArrayList<String> elves = new ArrayList<>();

        // ages ArrayList, for data of type Integer
        ArrayList<Integer> ages = new ArrayList<>();


        /* ADDING ELEMENTS TO ARRAYLISTS */

        // 4 well-known elves
        elves.add("Arwen");
        elves.add("Legolas");
        elves.add("Frodo");
        elves.add("Aragorn");

        // 4 ages of elves above
        ages.add(2778);
        ages.add(800);
        ages.add(51);
        ages.add(88);

        /* PRINTING ARRAYLISTS */

        // contents of elves
        for (String elf : elves) {
            System.out.println(elf);
        }

        // contents of ages (using same type as the Array List - Integer)
        for (Integer age : ages) {
            System.out.println(age);
        }


        /* USING ARRAYLIST & COLLECTIONS METHODS */

        // size of elves
        System.out.println(elves.size());

        System.out.println("Ages contains 2901? " + ages.contains(2901));

        // sort elves by default data type (i.e. String will sort alphabetically)
        elves.sort(null);
        System.out.println(elves);
        for (String elf : elves) {
            System.out.println(elf);
        }

        // And now the ages of the elves are not in the same order...
        // We will fix this with HashMapExamples
    }

}
