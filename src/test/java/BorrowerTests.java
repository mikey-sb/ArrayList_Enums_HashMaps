import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTests {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("B Money", "Big B", "Drama");
        library = new Library(2);
    }

    @Test
    public void borrowerHasEmptyBookListOnInit(){
        assertEquals(0, borrower.collectionLength());
    }

    @Test
    public void borrowerCanTakeBook(){
        library.addBook(book);
        borrower.takeBook(library, book);
        assertEquals(0, library.bookStockSize());
        assertEquals(1, borrower.collectionLength());
    }
}
