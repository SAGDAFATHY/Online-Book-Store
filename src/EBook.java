public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, String author, int year, double price, String fileType) {
        super(isbn, title, author, year, price);
        this.fileType = fileType;
    }

    @Override
    public void buy(int quantity, String email, String address) {
        if (quantity != 1) {
            System.out.println("EBook must be bought one at a time.");
            return;
        }
        System.out.println("Paid: " + price);
        System.out.println("Sent to email: " + email);
    }

    @Override
    public boolean isAvailable(int quantity) {
        return quantity == 1;
    }
}
