package CourseProject;

import java.util.*;

public final class MinSearcher {
    private MinSearcher() {
    }

    public static int min(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = array[0];
        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    public static double min(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException();
        }

        double min = array[0];
        for (double elem : array) {
            if (min > elem) {
                min = elem;
            }
        }

        return min;
    }

    public static <T> T min(List<T> list, Comparator<T> comparator) {

        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }

        T min = list.get(0);
        for (T elem : list) {
            if (comparator.compare(min, elem) > 0) { // min > elem
                min = elem;
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> T min(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException();
        }

        T min = list.get(0);
        for (T elem : list) {
            if (min.compareTo(elem) > 0) {  // min > elem
                min = elem;
            }
        }

        return min;
    }
}