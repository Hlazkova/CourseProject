package CourseProject;

public class Quote extends Item{

    private static int nextId = 1;

    private int quoteId = nextId++;
    private String quote;
        //bookId - quote must be be from some book, not by itself
        //readerId - quoted by one particular reader

    //Constructors

    public Quote() {
    }

    public Quote(String quote, int bookId, int readerId) {
        this.quote = quote;
        this.bookId = bookId;
        this.readerId = readerId;
    }

    //Getters and Setters

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public int getQuoteId() {
        return quoteId;
    }

    @Override
    public String toString() {
        return "Quote{" +
                " quoteId=" + quoteId +
                ", quote='" + quote + '\'' +
                ", bookId=" + bookId +
                ", readerId=" + readerId +
                '}';
    }
}