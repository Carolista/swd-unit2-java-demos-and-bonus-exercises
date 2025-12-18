package object_oriented_programming.library;

public class Book {

    // Static property gets stored with class, not object
    private static int nextIdNum = 1;

    // FIELDS

    private final String bookId; // unique for each object
    private String title;
    private String author;
    private int numPages;
    private boolean available = true;
    private int timesCheckedOut = 0;


    // CONSTRUCTORS

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
        this.bookId = generateBookId();
    }

    // Overloaded constructor allows numPages to be optional
    public Book(String title, String author) {
        this(title, author, 0);
    }


    // GETTERS & SETTERS

    public static int getNextIdNum() {
        return nextIdNum;
    }

    public String getBookId() {
        return bookId;
    }

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

    public int getTimesCheckedOut() {
        return timesCheckedOut;
    }

    public void setTimesCheckedOut(int timesCheckedOut) {
        this.timesCheckedOut = timesCheckedOut;
    }

    // OVERRIDE SPECIAL METHODS

    @Override
    public String toString() {
        String availability = isAvailable() ? "Available for checkout" : "CURRENTLY UNAVAILABLE";
        String timePlural = timesCheckedOut == 1 ? "" : "s";
        String newline = System.lineSeparator();
        return newline + getTitleAndAuthor() + newline +
                numPages + " pages" +
                newline + "Book " + bookId + " checked out " +
                timesCheckedOut + " time" + timePlural +
                newline + availability;
    }


    // INSTANCE METHODS

    private String generateBookId() {
        String id = Utils.getInitials(author) + "-" + title.substring(0,3).toUpperCase() + "-" + nextIdNum;
        nextIdNum++;
        return id;
    }

    public String getTitleAndAuthor() {
        return title + " by " + author;
    }

    public void checkOut() {
        if (available) {
            available = false;
            timesCheckedOut++;
            System.out.println(System.lineSeparator() + getTitleAndAuthor() + " has been checked out of the library.");
        }
    }

    public void checkIn() {
        if (!available) {
            available = true;
            System.out.println(System.lineSeparator() + getTitleAndAuthor() + " has been returned to the library.");
        }
    }
}
