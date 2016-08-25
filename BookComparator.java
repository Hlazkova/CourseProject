package CourseProject;

import java.util.Comparator;

/**
 * Created by naran on 8/23/2016.
 */
public enum BookComparator implements Comparator<Book> {
    BOOKID {
        @Override
        public int compare(Book a, Book b) {
            return Integer.compare(a.getBookId(), b.getBookId());
        }
    },
    TITLE {
        @Override
        public int compare(Book a, Book b) {
            return a.getTitle().compareTo(b.getTitle());
        }
    },
    AUTHOR {
        @Override
        public int compare(Book a, Book b) {
            return a.getAuthor().compareTo(b.getAuthor());        }
    },
    YEAR {
        @Override
        public int compare(Book a, Book b) {
            return Integer.compare(a.getYear(), b.getYear());
        }
    },
    PUBLISHER {
        @Override
        public int compare(Book a, Book b) {
            return a.getPublisher().compareTo(b.getPublisher());
        }
    },
    GENRE {
        @Override
        public int compare(Book a, Book b) {
            return a.getGenre().compareTo(b.getGenre());
        }
    };
}