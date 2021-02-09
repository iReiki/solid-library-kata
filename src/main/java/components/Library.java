package components;

import com.opencsv.exceptions.CsvException;
import files.BooksFile;
import files.UserFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Library {

    private BooksFile booksFile;
    private UserFile userFile;
    private ArrayList<Book> booksList;
    private ArrayList<User> userList;

    public Library() throws CsvException, IOException {
        this.booksFile = new BooksFile();
        this.booksList = this.booksFile.readFile();
        this.userFile = new UserFile();
        this.userList = new ArrayList<User>();
    }

    public ArrayList<Book> getBooksList(){
        return this.booksList;
    }

    public void addBook(Book book) throws IOException {
        this.booksList.add(book);
        this.booksFile.writeInBookFile(this.booksList);
    }

    public void printList() {
        for (Book book: this.booksList) {
            System.out.println("Title: " + book.title() + " Author: " + book.author());
        }
    }

    public void createUser(User user) throws IOException {
        this.userList.add(user);
        this.userFile.writeInUserFile(userList);
    }
}
