package CourseProject;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    private final String genderName;

    Gender(String genderName) {
        this.genderName = genderName;
    }

    public String getGenderName() {
        return genderName;
    }
}