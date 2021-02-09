package files;

import components.Book;
import components.User;

import java.io.IOException;
import java.util.ArrayList;

public interface IFileWriter {
    void writeInBookFile(ArrayList<Book> books) throws IOException;
    void writeInUserFile(ArrayList<User> users) throws IOException;
}
