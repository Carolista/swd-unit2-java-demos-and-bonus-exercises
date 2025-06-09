package object_oriented_programming.library;

public class Book {

    // TODO: Create static nextIdNum for creating unique bookIds
    private static int nextIdNum = 1;

    // FIELDS

    // TODO: Declare a final String bookId
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;
    // TODO: Declare an int timesCheckedOut (initialized to 0)


    // CONSTRUCTORS

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        // TODO: Set the value of bookId using an instance method
    }

    // TODO: Create an overloaded constructor that allows numPages to be optional


    // GETTERS & SETTERS

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public boolean isAvailable() {
        return available;
    }

    // TODO: remove setter for available
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // TODO: Add getter and setter for timesCheckedOut


    // OVERRIDE SPECIAL METHODS

    // TODO: Override toString() and produce a custom formatted block of information about a book


    // INSTANCE METHODS

    // TODO: Create an instance method that uses the current value of nextIdNum to generate an id

    // TODO: Create an instance method that returns a phrase like "Contact by Carl Sagan"

    // TODO: Create an instance method to check a book out and log a sentence about it

    // TODO: Create an instance method to check a book in and log a sentence about it

}
