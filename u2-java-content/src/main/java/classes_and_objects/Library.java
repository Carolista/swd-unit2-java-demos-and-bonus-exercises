package classes_and_objects;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object


    // GETTERS & SETTERS

    public ArrayList<Book> getBooks() {
        return books;
    }

    // INSTANCE METHODS

    public void addBooks(Book[] bookArray) {
        Collections.addAll(books, bookArray);
    }

    public void printAvailableBooks() {
        String newline = System.lineSeparator();
        System.out.println(newline + "LIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
