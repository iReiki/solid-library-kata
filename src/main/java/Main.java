import components.Book;

public class Main {

    public static void main (String[] args){
        Application app = new Application();

        Book newBook = new Book(1, "Mon livre", "Didier");
        app.getLibrary().addBook(newBook);
    }

}
