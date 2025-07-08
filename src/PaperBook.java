public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, String author, int year, double price, int stock) {
        super(isbn, title, author, year, price);
        this.stock = stock;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (quantity > stock) {
            System.out.println("Not enough stock for " + title);
            return;
        }
        stock -= quantity;
        System.out.println("paid: " + (price * quantity));
        System.out.println("Shipping to " + address);
    }

    @Override
    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }
}

