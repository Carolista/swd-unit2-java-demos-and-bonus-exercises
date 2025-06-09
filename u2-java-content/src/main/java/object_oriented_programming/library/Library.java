package object_oriented_programming.library;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    // TODO: Convert books to a package-private variable that cannot be overwritten
    private ArrayList<Book> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object


    // GETTERS & SETTERS

    // TODO: Remove getter for books
    public ArrayList<Book> getBooks() {
        return books;
    }

    // OVERRIDE SPECIAL METHODS

    // TODO: Override toString() and produce a custom formatted block of information about the library


    // INSTANCE METHODS

    // TODO: Remove addBooks() and remove the Collections import at the top of this file
    public void addBooks(Book[] bookArray) {
        Collections.addAll(books, bookArray);
    }

    public void printAvailableBooks() {
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

}
