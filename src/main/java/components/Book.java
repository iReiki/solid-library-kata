package components;

public class Book {

    private final String title;
    private final String author;
    private User isBorrowedBy;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowedBy = null;
    }

    public String author() {
        return author;
    }

    public String title() {
        return title;
    }

    public User isBorrowed() {
        return isBorrowedBy;
    }

    public void setBorrowed(User user) {
        this.isBorrowedBy = user;
    }


}
