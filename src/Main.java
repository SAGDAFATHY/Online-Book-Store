public class Main {
        public static void main(String[] args) {
            Inventory inventory = new Inventory();

            Book b1 = new PaperBook("ISBN-001", "Clean Code", "Robert C. Martin", 2008, 350, 5);
            Book b2 = new EBook("ISBN-002", "Effective Java", "Joshua Bloch", 2018, 250, "PDF");
            Book b3 = new ShowcaseBook("ISBN-003", "Demo Book", "Anonymous", 2022);

            inventory.addBook(b1);
            inventory.addBook(b2);
            inventory.addBook(b3);
            System.out.println("Example 1");

            inventory.buyBook("ISBN-001", 2, "sagda@example.com", "Alexandria, Egypt");
            inventory.buyBook("ISBN-002", 1, "sagda@example.com", "");
            inventory.buyBook("ISBN-003", 1, "test@example.com", "Cairo");

            System.out.println("--------------------------------------------");

            System.out.println("Example 2");
            Book oldBook = new PaperBook("ISBN-004", "Old Book", "Some Author", 2000, 120, 3);
            inventory.addBook(oldBook);
            inventory.removeOutdatedBooks(10);
            System.out.println("--------------------------------------------");

            System.out.println("Example 3");
            inventory.buyBook("ISBN-001", 10, "fail@example.com", "Nowhere");

            System.out.println("--------------------------------------------");

            System.out.println("Example 4");
            inventory.buyBook("ISBN-002", 2, "fail@example.com", "");

            System.out.println("--------------------------------------------");

            System.out.println("Example 5");
            Book b5 = new PaperBook("ISBN-005", "One Copy Book", "Rare Author", 2021, 500, 1);
            inventory.addBook(b5);
            inventory.buyBook("ISBN-005", 1, "lastbuyer@example.com", "Mansoura");

        }
}