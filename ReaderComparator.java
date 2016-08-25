package CourseProject;

import java.util.Comparator;

public enum ReaderComparator implements Comparator<Reader> {
    READERID {
        @Override
        public int compare(Reader a, Reader b) {
            return Integer.compare(a.getReaderId(), b.getReaderId());
        }
    },
    NAME {
        @Override
        public int compare(Reader a, Reader b) {
            return a.getName().compareTo(b.getName());
        }
    },
    EMAIL {
        @Override
        public int compare(Reader a, Reader b) {
            return a.getEmail().compareTo(b.getEmail());
        }
    },
    AGE {
        @Override
        public int compare(Reader a, Reader b) {
            return Integer.compare(a.getAge(), b.getAge());
        }
    },
    GENDER {
        @Override
        public int compare(Reader a, Reader b) {
            return a.getGender().compareTo(b.getGender());
        }
    };
}