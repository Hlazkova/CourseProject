package CourseProject;

public enum Genre {
    DRAMA("Drama"), NOVEL("Novel"), POEM("Poem"), MYTH("Myth"), COMEDY("Comedy"),
    ROMANCE("Romance"), SATIRE("Satire"), TRAGEDY("Tragedy"), HORROR("Horror"),
    CLASSIC("Classic"), DETECTIVE("Detective"), FAIRYTALE("Fairy tale"),
    FANTASY("Fantasy"), LEGEND("Legend"), WESTERN("Western"), BIOGRAPHY("Biography"), LOVESTORY("Love story");

    private final String genreName;

    Genre(String genreName) {
        this.genreName = genreName;
    }

    public String getGenreName() {
        return genreName;
    }
}
