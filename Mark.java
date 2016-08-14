package CourseProject;


public class Mark extends Item{
    private static int nextId = 1;

    private int markId = nextId++;
    private int mark;

    //Constructors

    public Mark() {
    }

    public Mark(int mark, int bookId, int readerId) {
        this.mark = mark;
        this.bookId = bookId;
        this.readerId = readerId;
    }

    //Getters and Setters

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMarkId() {
        return markId;
    }

    @Override
    public String toString() {
        return "Mark{" +
                " markId=" + markId +
                ", mark=" + mark +
                ", bookId=" + bookId +
                ", readerId=" + readerId +
                '}';
    }
}