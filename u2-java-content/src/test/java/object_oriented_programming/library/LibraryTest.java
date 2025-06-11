package object_oriented_programming.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    Book book1;
    Book book2;
    Library library;

    @BeforeEach
    public void createTestData() {
        book1 = new Book("Hidden Figures", "Margot Lee Shetterly", 271);
        book2 = new Book("Code Girls", "Liza Mundy");
        library = new Library();
    }

    @Test
    public void constructorSetsBookList() {
        String notNullMsg = "a list of books exists";
        assertNotNull(library.books, notNullMsg);

        String sizeMsg = "a new library has an empty list of books";
        int expectedSize = 0;
        int actualSize = library.books.size();
        assertEquals(expectedSize, actualSize, sizeMsg);
    }

    @Test
    public void booksAddedToLibrary() {
        String sizeMsg = "book list has increased in size";
        int originalSize = library.books.size();
        library.books.add(book1);
        int expectedSize = originalSize + 1;
        int actualSize = library.books.size();
        assertEquals(expectedSize, actualSize, sizeMsg);

        String containsMsg = "book list contains book";
        boolean condition = library.books.contains(book1);
        assertTrue(condition, containsMsg);
    }

}
