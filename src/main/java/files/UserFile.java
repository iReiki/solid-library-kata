package files;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import components.Book;
import components.User;

import java.io.*;
import java.util.ArrayList;

public class UserFile implements IFileReader, IFileWriter {

    private final String fileName = "/csv/library.csv";
    private final String filePath = this.getClass().getResource(fileName).getFile();
    private final CSVReader csvReader;

    public UserFile() throws FileNotFoundException {
        this.csvReader = new CSVReader(new FileReader(filePath));
    }

    private boolean isFile() {
        File csvFile = new File(filePath);
        return csvFile.isFile();
    }

    @Override
    public ArrayList<Book> readFile() throws IOException, CsvException {
        return null;
    }


    @Override
    public void writeInBookFile(final ArrayList<Book> books) throws IOException {}


    @Override
    public void writeInUserFile(final ArrayList<User> users) throws IOException {
        FileWriter csvWriter = new FileWriter(filePath);
        for (User user : users) {
            csvWriter.append(user.login());
            csvWriter.append('\n');
        }
        csvWriter.flush();
        csvWriter.close();
    }
}
