package CourseProject;

import java.util.List;

/**
 * Created by Olya on 8/14/2016.
 */
public class Utils {

    public static void printList(List<Quote> list) {
        for (Quote o: list) {
            System.out.println(o.getQuoteId() +" " + o.getQuote());
        }
    }

    public static void printBookList(List<Book> list) {
        for (Book o: list) {
            System.out.println(o.getBookId() +" " + o.getTitle());
        }
    }

    //get all marks by book (bookId)
    //get all quotes by book (bookId)
    //get all reviews by book (bookId)

    //get all marks by reader (readerId) - through the MyShelf
    //get all quotes by reader (readerId)
    //get all reviews by reader (readerId)

    //create sorting


    //sort books by title (MyShelf)


    //create filtering


}
