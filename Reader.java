package CourseProject;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static int nextId = 1;

    private int readerId = nextId++;
    private String name;
    private String email;
    private int age;
    private Gender gender;

    //Constructors

    public Reader() {
    }

    public Reader(String name, String email, int age, Gender gender) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;

    }

    //Getters and Setters

    public int getReaderId() {
        return readerId;
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

    public String getGender() {
        return gender.getGenderName();
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "readerId=" + readerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}