package CourseProject;

import java.util.ArrayList;
import java.util.List;

public class MyShelf {
    private List<MyBook> myBooks;
    private int readerId;

    private List<Quote> myQuotes = new ArrayList<>();
    private List<Review> myReviews = new ArrayList<>();
    private List<Mark> myMarks = new ArrayList<>();

    //Add-remove

    public void addBook(MyBook myBook) {
        myBooks.add(myBook);
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
