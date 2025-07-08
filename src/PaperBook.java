public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn, String title, int year, double price, String author, int stock) {
        super(isbn, title, year, price, author);
        this.stock = stock;
    }

    public int getStock() { return stock; }
    public void reduceStock(int qty) { stock -= qty; }
    public void increaseStock(int qty) { stock += qty; }

    public void setStock(int stock) { this.stock = stock; }

    @Override
    public boolean isForSale() { return true; }
}
