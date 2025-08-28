package concept_reviews.part_2;

import java.util.ArrayList;
import java.util.Collections;

public class Furniture {

    // TODO: Define the Furniture class with 5-8 private fields
    //  that each piece of furniture might have in common.
    //  Include a boolean of some kind.
    //  Also, one of these fields should allow for multiple materials to be listed
    //  and you should consider how to add items to the list upon instantiation.

    private String name;
    private String manufacturer;
    private String category;
    private double height; // inches
    private double width; // inches
    private double depth; // inches
    private boolean assemblyRequired;

    private final ArrayList<String> materials = new ArrayList<>();


    // TODO: Use IntelliJ's generate feature to add a constructor and getters/setters.
    //  Modify the constructor if needed, depending on how you handle the list of materials.

    public Furniture(String name, String manufacturer, String category, double height, double width, double depth, boolean assemblyRequired, String[] materialsArray) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.assemblyRequired = assemblyRequired;
        Collections.addAll(materials, materialsArray);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean isAssemblyRequired() {
        return assemblyRequired;
    }

    public void setAssemblyRequired(boolean assemblyRequired) {
        this.assemblyRequired = assemblyRequired;
    }

    public ArrayList<String> getMaterials() {
        return materials;
    }


    // TODO: Override the class's .toString() method to print a nicely-formatted
    //  output of its properties.

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + name.toUpperCase() + newline +
                "Manufacturer: " + manufacturer + newline +
                "Category: " + category + newline +
                "Dimensions: " + height + "\"H x " + width + "\"W x " + depth + "\"D" + newline +
                "Assembly Required: " + (assemblyRequired ? "Yes" : "No") + newline +
                "Materials: " + String.join(", ", materials);
    }
}
