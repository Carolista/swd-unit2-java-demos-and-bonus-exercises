package object_oriented_programming.library;

import java.util.ArrayList;
import java.util.Collections;

public class Library {

    // TODO: Convert books to a package-private variable that cannot be overwritten
    final ArrayList<Book> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object


    // GETTERS & SETTERS



    // OVERRIDE SPECIAL METHODS

    // TODO: Override toString() and produce a custom formatted block of information about the library

    @Override
    public String toString() {
        StringBuilder allBookInfo = new StringBuilder();
        String newline = System.lineSeparator();
        for (Book book : books) {
            allBookInfo.append(book.toString());
            allBookInfo.append(newline)
                    .append("-------------------------");
        }
        return newline + "WELCOME TO OUR LIBRARY! " + newline +
                newline + "View our full collections:" + newline +
                allBookInfo;
    }


    // INSTANCE METHODS



    public void printAvailableBooks() {
        System.out.println("\nLIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitleAndAuthor());
            }
        }
    }

}
