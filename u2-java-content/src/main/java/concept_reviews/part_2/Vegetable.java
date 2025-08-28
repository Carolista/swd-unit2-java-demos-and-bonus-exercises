package concept_reviews.part_2;

public class Vegetable {

    // TODO: Define the Vegetable class with 3-4 private fields
    //  that each vegetable might have in common.

    private String name;
    private String color;
    private double weight; // ounces


    // TODO: Use IntelliJ's generate feature to add a constructor and getters/setters.

    public Vegetable(String name, String color, double weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    // TODO: Override the class's .toString() method to print a nicely-formatted
    //  output of its properties.

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + name.toUpperCase() + newline +
                "Color: " + color + newline +
                "Weight: " + weight + " oz.";
    }
}
