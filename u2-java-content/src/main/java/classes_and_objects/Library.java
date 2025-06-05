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

    public void addBooks(Book[] bookArray) {
//        for (Book book : bookArray) {
//            books.add(book);
//        }
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
