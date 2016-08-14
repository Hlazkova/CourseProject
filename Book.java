package CourseProject;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private static int nextId = 1;

    private int bookId = nextId++;
    private String title;
    private String author;
    private int year;
    private String publisher;
    private Genre genre; // one book - one genre
    private List <Review> reviews = new ArrayList<>();
    private List <Mark> marks = new ArrayList<>();

    //Constructors

    public Book() {
    }

    public Book (String title, String author, int year, String publisher, Genre genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
    }

    //Functions

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

    //Getters and Setters

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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", genre=" + genre +
                ", reviews=" + reviews +
                ", marks=" + marks +
                '}';
    }
}
