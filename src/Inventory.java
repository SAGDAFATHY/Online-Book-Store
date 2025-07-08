import java.util.*;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Book added: " + book.title);
    }

    public Book removeBook(String isbn) {
        return books.remove(isbn);
    }

    public List<Book> removeOutdatedBooks(int yearsLimit) {
        List<Book> removed = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();
        Iterator<Book> it = books.values().iterator();
        while (it.hasNext()) {
            Book book = it.next();
            if (currentYear - book.getYear() > yearsLimit) {
                it.remove();
                removed.add(book);
                System.out.println("Removed outdated book: " + book.title);
            }
        }
        return removed;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book == null) {
            System.out.println("Book not found.");
            return 0;
        }
        if (!book.isAvailable(quantity)) {
            System.out.println("Not enough stock or invalid quantity for: " + book.title);
            return 0;
        }
        book.buy(quantity, email, address);
        return book.getPrice() * quantity;
    }
}
