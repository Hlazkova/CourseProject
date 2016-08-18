package CourseProject;

import java.util.ArrayList;
import java.util.List;

public class MyShelf {
    private List<MyBook> myBooks = new ArrayList<>();
    private int readerId;

    private List<Quote> myQuotes = new ArrayList<>();
    private List<Review> myReviews = new ArrayList<>();
    private List<Mark> myMarks = new ArrayList<>();

    //Constructors

    public MyShelf() {
    }

    public MyShelf(int readerId) {
        this.readerId = readerId;
    }

    //Add-remove

    public void addBook(MyBook ... books) {

        for (MyBook m: books) {

            if (this.getReaderId() == m.getReaderId() && !(myBooks.contains(m))) {
                myBooks.add(m);
            } else {
                System.out.println("Book with id = " + m.getBookId() + " - not for this reader or it is already added...");
            }
        }
    }

    public void removeBook(MyBook myBook) {
        myBooks.remove(myBook);
    }

    public void addQuote(Quote quote){
        myQuotes.add(quote);
    }

    public void removeQuote(Quote quote) {
        myQuotes.remove(quote);
    }

    public void addReview(Review review) {
        myReviews.add(review);
    }

    public void removeReview(Review review) {
        myReviews.remove(review);
    }

    public void addMark(Mark mark){
        myMarks.add(mark);
    }

    //Getter and Setter

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public List<MyBook> getMyBooks () {
        return myBooks;
    }

    public List<Quote> getMyQuotes() {
        return myQuotes;
    }

    public List<Mark> getMyMarks() {
        return myMarks;
    }

    public List<Review> getMyReviews() {
        return myReviews;
    }

    @Override
    public String toString() {
        return "MyShelf{" +
                "myBooks=" + myBooks +
                ", readerId=" + readerId +
                '}';
    }
}
