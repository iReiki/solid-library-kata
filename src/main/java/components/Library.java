package components;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> booksList;

    public Library() {
        this.booksList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void addBook(Book book) {
        this.booksList.add(book);
        System.out.println("Book added");
    }
}
