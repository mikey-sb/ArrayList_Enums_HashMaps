import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTests {
    private Book book;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;
    private Library library;

    @Before
    public void before(){
        library = new Library(6);
        book = new Book("P Money", "Dr. P", "Crime");
        book2 = new Book("G Money", "Dr. G", "Fiction");
        book3 = new Book("D Money", "Dr. D", "Thriller");
        book4 = new Book("C Money", "Dr. C", "Crime");
        book5 = new Book("J Money", "Dr. J", "Thriller");
    }

    @Test
    public void libraryHasBookStock(){
        assertEquals(0, library.bookStockSize());
    }

    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        library.addBook(book2);
        assertEquals(2, library.bookStockSize());
    }

    @Test
    public void libraryCannotAddPastCapacity(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookStockSize());
    }

    @Test
    public void libraryHasGenreList(){
        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addAllToGenreList();
        assertEquals(3, library.genreListSize());
    }



}
