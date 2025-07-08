public abstract class Book {
    protected String isbn;
    protected String title;
    protected String author;
    protected int year;
    protected double price;

    public Book(String isbn, String title, String author, int year, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public abstract void buy(int quantity, String email, String address);
    public abstract boolean isAvailable(int quantity);
    public int getYear() {
        return year;
    }
    public String getIsbn() {
        return isbn;
    }
    public double getPrice() {
        return price;
    }
}
