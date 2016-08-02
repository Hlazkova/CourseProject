package CourseProject;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static int nextId = 0;
    //maybe String, not List of String?
    private static final List<String> DEFAULT_QUOTE = new ArrayList<>();
    private static final List<Integer> DEFAULT_MARK = new ArrayList<>();

    private int readerId = nextId++;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private List<String> myQuotes = new ArrayList();
    private List<Review> myReviews = new ArrayList();
    private List<Integer> myMarks = new ArrayList<>();

    public Reader(String name, String email, int age, Gender gender, List<String> myQuotes, List<Integer> myMarks) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.myQuotes = myQuotes;
        this.myMarks = myMarks;
    }

    public Reader(String name, String email, int age, Gender gender, List<String> myQuotes) {
        this(name, email, age, gender, myQuotes, DEFAULT_MARK);
    }

    public Reader(String name, String email, int age, Gender gender) {
        this(name, email, age, gender, DEFAULT_QUOTE, DEFAULT_MARK);
    }

    public void addQuote(String quote){
        myQuotes.add(quote);
    }

    public void addMark(int mark){
        myMarks.add(mark);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<String> getMyQuotes() {
        return myQuotes;
    }

    public void setMyQuotes(List<String> myQuotes) {
        this.myQuotes = myQuotes;
    }

    public List<Integer> getMyMarks() {
        return myMarks;
    }

    public void setMyMarks(List<Integer> myMarks) {
        this.myMarks = myMarks;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", myQuotes=" + myQuotes +
                ", myMarks=" + myMarks +
                '}';
    }
}