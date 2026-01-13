package classes_and_objects;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    // TODO: Declare a field, books, as an ArrayList of Book objects
    // Give it private access
    private ArrayList<Book> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object

    public ArrayList<Book> getBooks() {
        return books;
    }


    // TODO: Create a method to add books and another to print available books
    public void addBooks(Book[] bookArray) {
        Collections.addAll(books, bookArray);
    }

    public void printAvailableBooks() {
        String newline = System.lineSeparator();
        System.out.println(newline + "LIST OF BOOKS AVAILABLE:");
        for (Book book: books) {
            if (book.isAvailable()) {
                System.out.println( "\t" + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

}
