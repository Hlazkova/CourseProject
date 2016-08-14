package CourseProject;

public class Item {

    protected int bookId;
    protected int readerId;

    //Constructor

    public Item() {
    }

    //Getters and Setters

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


}
