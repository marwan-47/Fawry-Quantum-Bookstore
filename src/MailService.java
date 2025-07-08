public class MailService {
    public static void send(String email, EBook book) {
        System.out.println("Quantum book store: Sending eBook " + book.getTitle() + " (" + book.getFileType() + ") to " + email);
    }
}
