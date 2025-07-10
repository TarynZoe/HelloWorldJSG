import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }
    public ArrayList<Book> displayLibrary() {
        return books;
    }
    Library.addBook(new Book("1984", "George Orwell", "9780000000001", 1949));

}
