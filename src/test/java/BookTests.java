import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTests {
    private Book book;

    @Before
    public void before() {
        book = new Book("Big P", "P Money", "Crime");
    }

    @Test
    public void bookHasTitle() {
        assertEquals("Big P", book.getTitle());
    }



}

