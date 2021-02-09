package files;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import components.Book;
import components.User;

import java.io.*;
import java.util.ArrayList;

public class BooksFile implements IFileReader, IFileWriter {

    private final String filePath = "data/library.csv";
    private final CSVReader csvReader;


    public BooksFile() throws FileNotFoundException {
        this.csvReader = new CSVReader(new FileReader(filePath));
    }

    private boolean isFile() {
        File csvFile = new File(filePath);
        return csvFile.isFile();
    }

    @Override
    public ArrayList<Book> readFile() throws IOException, CsvException {
        ArrayList<Book> books = new ArrayList<Book>();
        String[] data;
        if (this.isFile()) {
            while ((data = csvReader.readNext()) != null) {
                Book newBook = new Book(data[0], data[1]);
                String isBorrowBy = data[2];
                if (!isBorrowBy.isEmpty()) {
                    newBook.setBorrowed(new User(isBorrowBy));
                }
                books.add(newBook);
            }
        }
        return books;

    }

    @Override
    public void writeInBookFile(ArrayList<Book> books) throws IOException {
        FileWriter csvWriter = new FileWriter(filePath);
        for (Book book : books) {
            csvWriter.append(book.title());
            csvWriter.append(',');
            csvWriter.append(book.author());
            csvWriter.append(',');
            User user = book.isBorrowed();
            if (user == null) {
                csvWriter.append("");
            } else {
                csvWriter.append(user.login());
            }

            csvWriter.append('\n');
        }
        csvWriter.flush();
        csvWriter.close();
    }

    @Override
    public void writeInUserFile(final ArrayList<User> users) throws IOException {}
}
