package classes_and_objects;

public class Book {

    // FIELDS

    // TODO: Declare private fields title, author, numPages, and available
    // available should be initialized to true
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;


    // CONSTRUCTORS

    // TODO: Define a constructor that takes title, author, and numPages
    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }



    // GETTERS & SETTERS

    // TODO: Use the IntelliJ generate feature to create getters & setters
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

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void checkOut() {
        this.setAvailable(false);
        System.out.println(title + " has been checked out of the library");
    }

    public void checkIn() {
        available = true;
        System.out.println(title + " has been returned to the library");
    }
}
