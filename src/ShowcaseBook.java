public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn, String title, int year, String author) {
        super(isbn, title, year, 0.0, author);
    }

    @Override
    public boolean isForSale() { return false; }
}
