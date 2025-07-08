import java.util.*;

public class BookInventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Added book " + book.getTitle());
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public Book removeBook(String isbn) {
        return books.remove(isbn);
    }

    public List<Book> removeOutdatedBooks(int currentYear, int maxAge) {
        List<Book> removed = new ArrayList<>();
        Iterator<Map.Entry<String, Book>> it = books.entrySet().iterator();
        while (it.hasNext()) {
            Book book = it.next().getValue();
            if (currentYear - book.getYear() > maxAge) {
                removed.add(book);
                it.remove();
                System.out.println("Quantum book store: Removed outdated book " + book.getTitle());
            }
        }
        return removed;
    }
}
