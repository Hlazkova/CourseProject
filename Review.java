package CourseProject;

public class Review extends Item{
    private static int nextId = 1;

    private int reviewId = nextId++;

    private String reviewText;
    //bookId - one review for one particular book
    //readerId - by one particular reader

    //Constructors

    public Review() {
    }

    public Review(String reviewText, int bookId, int readerId) {
        this.reviewText = reviewText;
        this.bookId = bookId;
        this.readerId = readerId;
    }

    //Getters and Setters

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public int getReviewId() {
        return reviewId;
    }

    @Override
    public String toString() {
        return "Review{" +
                " reviewText='" + reviewText + '\'' +
                ", reviewId=" + reviewId +
                ", bookId=" + bookId +
                ", readerId=" + readerId +
                '}';
    }
}
