package object_oriented_programming.library;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell", 300);

        Library library = new Library();

        Book[] bookArr = { book1, book2, book3};

        // TODO: Use Collections to add all books from bookArr to library


        // TODO: Check out books 1 and 3


        // TODO: Check book 1 back in


        // TODO: Print book 3


        // TODO: Print the library


        library.printAvailableBooks();
    }
}
