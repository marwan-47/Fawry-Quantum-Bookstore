public class QuantumBookStore {
    private BookInventory inventory;

    public QuantumBookStore(BookInventory inventory) {
        this.inventory = inventory;
    }

    public double buyBook(String isbn, int quantity, String email, String address) throws Exception {
        Book book = inventory.getBook(isbn);
        if (book == null || !book.isForSale()) {
            throw new Exception("Quantum book store: Book not available for sale.");
        }
        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            if (pb.getStock() < quantity) {
                throw new Exception("Quantum book store: Not enough stock for " + pb.getTitle());
            }
            pb.reduceStock(quantity);
            ShippingService.ship(address, pb, quantity);
            System.out.println("Quantum book store: Sold " + quantity + " paper book(s) of " + pb.getTitle());
            return pb.getPrice() * quantity;
        } else if (book instanceof EBook) {
            EBook eb = (EBook) book;
            MailService.send(email, eb);
            System.out.println("Quantum book store: Sold eBook " + eb.getTitle());
            return eb.getPrice();
        } else {
            throw new Exception("Quantum book store: Book type not supported for purchase.");
        }
    }

    public void addBook(Book book) {
        inventory.addBook(book);
    }

    public void removeOutdatedBooks(int currentYear, int maxAge) {
        inventory.removeOutdatedBooks(currentYear, maxAge);
    }
}
