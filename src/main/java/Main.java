import com.opencsv.exceptions.CsvException;
import components.Book;
import components.User;

import java.io.IOException;

public class Main {

    public static void main (String[] args) throws IOException, CsvException {
        Application app = new Application();

        Book newBook = new Book("Mon livre", "Didier");
        app.getLibrary().addBook(newBook);
        app.getLibrary().printList();

        User newUser = new User("bobo");
        app.getLibrary().createUser(newUser);
    }

}
