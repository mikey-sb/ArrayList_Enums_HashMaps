import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBookList;

    public Borrower(){
        this.borrowedBookList = new ArrayList<>();

    }


    public int collectionLength() {
        return this.borrowedBookList.size();
    };

    public void takeBook(Library library, Book book) {
        library.removeBook(book);
        this.borrowedBookList.add(book);
    }
}
