package object_oriented_programming.library;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell", 300);

        Library library = new Library();

        Book[] bookArr = { book1, book2, book3};

        Collections.addAll(library.books, bookArr);

        book1.checkOut();
        book3.checkOut();

        book1.checkIn();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println(library);

        library.printAvailableBooks();
    }
}
