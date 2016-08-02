package CourseProject;

public class Quote {
    private static int nextId = 0;

    private int quoteId = nextId++;
    private String quote;
    private int bookId;

    public Quote(String quote) {
        this.quote = quote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "quoteId=" + quoteId +
                ", quote='" + quote + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}