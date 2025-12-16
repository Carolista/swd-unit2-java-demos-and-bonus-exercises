package classes_and_objects;

public class Book {

    // FIELDS

    private String title;
    private String author;
    private int numPages;
    private boolean available = true;


    // CONSTRUCTORS

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }


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

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }


    // INSTANCE METHODS

    public void checkOut() {
        this.setAvailable(false);
        System.out.println(System.lineSeparator() + title + " has been checked out of the library.");
    }

    public void checkIn() {
        available = true;
        System.out.println(System.lineSeparator() + title + " has been returned to the library.");
    }

}
