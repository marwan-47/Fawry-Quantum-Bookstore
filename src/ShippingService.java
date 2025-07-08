public class ShippingService {
    public static void ship(String address, PaperBook book, int quantity) {
        System.out.println("Quantum book store: Shipping " + quantity + " copies of " + book.getTitle() + " to " + address);
    }
}
