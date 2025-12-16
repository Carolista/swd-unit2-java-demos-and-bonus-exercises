package object_oriented_programming.library;

import java.util.ArrayList;

public class Library {

    // No longer private, just package-private by default
    // Cannot be overwritten due to final keyword
    final ArrayList<Book> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object


    // OVERRIDE SPECIAL METHODS

    @Override
    public String toString() {
        String line = Utils.newline + "------------------------------------" + Utils.newline;
        StringBuilder allBookInfo = new StringBuilder();
        for (Book book : books) {
            allBookInfo.append(book.toString());
            allBookInfo.append(line);
        }
        return Utils.newline + "WELCOME TO OUR LIBRARY!" + Utils.newline +
                "View our full collection:" +
                line +
                allBookInfo; // automatically converted to String due to concatenation
    }


    // INSTANCE METHODS

    public void printAvailableBooks() {
        System.out.println(Utils.newline + "LIST OF BOOKS AVAILABLE:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("\t" + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
