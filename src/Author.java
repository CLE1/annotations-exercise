import java.util.ArrayList;
import java.util.List;

public class Author extends Person {

    private final List<String> books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList<>();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    public String sortName() {
        return String.format("%s, %s", super.lastName, super.firstName);
    }
}