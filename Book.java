package CourseProject;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private int year;
    private String publisher;
    private List<Genre> favGenres = new ArrayList<>();
    private List <Review> reviews = new ArrayList<>();
    private List <Mark> marks = new ArrayList<>();

    //Constructors

    public Book(int bookId, String title, String author, int year, String publisher) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }

    //add - remove items

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void removeReview(Review review) {
        reviews.remove(review);
    }

    public void addMark(Mark mark) {
        marks.add(mark);
    }

    public void removeMark(Mark mark) {
        marks.remove(mark);
    }

    public void addFavGenres (Genre genre) {
        favGenres.add(genre);
    }

    public void removeFavGenres (Genre genre) {
        favGenres.remove(genre);
    }

    //getters and setters

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getAverageMark(List<Mark> marks) {
        double averageMark = 0;
        int sum = 0;
        int n = marks.size();

        if (n == 0) {
            averageMark = 0;
        } else {
            for (Mark mark : marks) {
                sum += mark.getMark();
            }
            averageMark = sum / n;
        }

        return averageMark;
    }


}
