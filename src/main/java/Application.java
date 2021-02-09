import com.opencsv.exceptions.CsvException;
import components.Library;

import java.io.IOException;

public class Application {

    private final Library library;

    public Application() throws IOException, CsvException {
        this.library = new Library();
    }

    // Temporaire
    public Library getLibrary() {
        return library;
    }
}
