public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, String author, int year) {
        super(isbn, title, author, year, 0.0);
    }

    @Override
    public void buy(int quantity, String email, String address) {
        System.out.println("Book '" + title + "' is not for sale.");
    }

    @Override
    public boolean isAvailable(int quantity) {
        return false;
    }
}
