package object_oriented_programming.library;

import java.util.ArrayList;

public class Library {

    // No longer private, just protected/package-private by default
    // Cannot be overwritten due to final keyword
    final ArrayList<Book> books = new ArrayList<>();

    // Note: the default constructor is sufficient to instantiate a library object

    // OVERRIDE SPECIAL METHODS

    @Override
    public String toString() {
        StringBuilder allBookInfo = new StringBuilder();
        String newline = System.lineSeparator();
        for (Book book : books) {
            allBookInfo.append(book.toString());
            allBookInfo.append(newline)
                    .append("----------------------------");
        }
        return newline + "WELCOME TO OUR LIBRARY! " + newline +
                newline + "View our full collection:" + newline +
                allBookInfo;
        // allBookInfo is automatically converted to String due to concatenation with other strings
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
