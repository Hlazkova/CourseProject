package CourseProject;


public class Mark {
    private static int nextId = 0;

    private int markId = nextId++;
    private int mark;
    private int bookId;

    public Mark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "markId=" + markId +
                ", mark=" + mark +
                ", bookId=" + bookId +
                '}';
    }
}