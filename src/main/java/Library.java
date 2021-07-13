import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> bookList;
    private int capacity;
    private HashMap<String, Integer> genreList;


    public Library(int capacity){
        this.bookList = new ArrayList<>();
        this.capacity = capacity;
        this.genreList = new HashMap();

    }

    public int bookStockSize() {
        return bookList.size();
    }

    public void addBook(Book book) {
        if(this.bookStockSize() < this.capacity){
        bookList.add(book);}
    }

    public int genreListSize() {
        return genreList.size();
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void addAllToGenreList() {
        int fictionCount = 0;
        int thrillerCount = 0;
        int crimeCount = 0;
        for(Book book : bookList){
            if(book.getGenre() == "Fiction"){
                fictionCount ++; genreList.put(book.getGenre(), fictionCount);
            } else if (book.getGenre() == "Thriller"){
                thrillerCount ++; genreList.put(book.getGenre(), thrillerCount);
            } else if (book.getGenre() == "Crime"){
                crimeCount++; genreList.put(book.getGenre(), crimeCount);
            }
        }


    }

    }

