package Optional.model;

/**
 * @author wuyang
 * @version 1.0
 * @date 2019/12/19 18:47
 */
public class Book {
    private String bookName;
    private String bookTitle;

    public Book(String bookName, String bookTitle) {
        this.bookName = bookName;
        this.bookTitle = bookTitle;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookName='" + bookName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
