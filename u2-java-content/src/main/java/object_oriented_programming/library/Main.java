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
        Collections.addAll(library.books, bookArr);


        // TODO: Check out books 1 and 3
        book1.checkOut();
        book3.checkOut();


        // TODO: Check book 1 back in
        book1.checkIn();


        // TODO: Print book 3
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);




        // TODO: Print the library
        System.out.println(library);


        library.printAvailableBooks();
    }
}
