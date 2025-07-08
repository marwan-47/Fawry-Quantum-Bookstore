public class EBook extends Book {
    private String fileType;

    public EBook(String isbn, String title, int year, double price, String author, String fileType) {
        super(isbn, title, year, price, author);
        this.fileType = fileType;
    }

    public String getFileType() { return fileType; }

    
    public void setFileType(String fileType) { this.fileType = fileType; }

    @Override
    public boolean isForSale() { return true; }
}
