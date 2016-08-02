package CourseProject;

import java.util.List;

public class MyShelf {
    private List<Book> myBooks;
    private int readerId;

    public void addBook(Book book) {
        myBooks.add(book);
    }

    public void removeBook(Book book) {
        myBooks.remove(book);
    }



    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }
}
