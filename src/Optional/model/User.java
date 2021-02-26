package Optional.model;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/19 17:36
 */

public class User {
    private String username;
    private String email;
    private Book book;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", book=" + book +
                '}';
    }
}
