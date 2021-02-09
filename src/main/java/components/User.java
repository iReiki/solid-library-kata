package components;

public class User {

    private final String login;

    public User(String login) {
        this.login = login;
    }

    public String login() {
        return login;
    }
}
