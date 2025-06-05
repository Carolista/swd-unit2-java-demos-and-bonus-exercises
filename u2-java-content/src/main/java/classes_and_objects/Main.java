package classes_and_objects;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book("Contact", "Carl Sagan", 430);
        Book book2 = new Book("Nemesis", "Isaac Asimov", 364);
        Book book3 = new Book("1984", "George Orwell", 300);

        Book[] bookArr = { book1, book2, book3};

        library.addBooks(bookArr);

        library.printAvailableBooks();
    }

}
