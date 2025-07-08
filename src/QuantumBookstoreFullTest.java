public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        BookInventory inventory = new BookInventory();
        QuantumBookStore store = new QuantumBookStore(inventory);

        store.addBook(new PaperBook("ISBN001", "Java Basics", 2015, 100.0, "Alice", 10));
        store.addBook(new EBook("ISBN002", "Learn Python", 2018, 50.0, "Bob", "PDF"));
        store.addBook(new ShowcaseBook("ISBN003", "Demo Book", 2020, "Charlie"));

        store.removeOutdatedBooks(2024, 7);

        try {
            double paid = store.buyBook("ISBN001", 2, "buyer@example.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            double paid = store.buyBook("ISBN002", 1, "buyer@example.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount: " + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        try {
            store.buyBook("ISBN003", 1, "buyer@example.com", "123 Main St");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
