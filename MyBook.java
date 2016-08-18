package CourseProject;

public class MyBook {
    StatusOfBook statusOfBook;
    private int bookId;  //particular book
    private int readerId;  //for particular reader

    //Constructors

    public MyBook() {
    }

    public MyBook(StatusOfBook statusOfBook, int bookId, int readerId) {
        this.bookId = bookId;
        this.readerId = readerId;
        this.statusOfBook = statusOfBook;
        this.readerId = readerId;
    }

    //Getters ans Setters

    public StatusOfBook getStatusOfBook() {
        return statusOfBook;
    }

    public void setStatusOfBook(StatusOfBook statusOfBook) {
        this.statusOfBook = statusOfBook;
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "statusOfBook=" + statusOfBook +
                ", bookId=" + bookId +
                ", readerId=" + readerId +
                '}';
    }
}
