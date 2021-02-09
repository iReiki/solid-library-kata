package files;

import com.opencsv.exceptions.CsvException;
import components.Book;

import java.io.IOException;
import java.util.ArrayList;

public interface IFileReader {

    ArrayList<Book> readFile() throws IOException, CsvException;
}
