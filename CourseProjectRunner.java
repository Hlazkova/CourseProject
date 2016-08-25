package CourseProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class CourseProjectRunner {
    public static void main(String[] args) {



        Reader reader1 = new Reader("Nastia", "narolskaya@meta.ua", 25, Gender.FEMALE); //id = 1
        Reader reader2 = new Reader("Olia", "hlazkova@meta.ua", 31, Gender.FEMALE);     //id = 2

        Book book1 = new Book("Title1", "author1", 1930, "publisher", Genre.BIOGRAPHY); //id = 1
        Book book2 = new Book("Title2", "author2", 1940, "publisher", Genre.CLASSIC);   //id = 2
        Book book3 = new Book("Title3", "author1", 1930, "publisher", Genre.DRAMA);     //id = 3
        Book book4 = new Book("Title4", "author3", 1967, "publisher", Genre.FANTASY);   //id = 4

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book4);
        books.add(book3);
        books.add(book2);

        List<Quote> quotes = new ArrayList<> ();
        Quote quote1 = new Quote("Once I had fun, it was awful..",1,1);
        Quote quote2 = new Quote("Tomorrow never dies!",1,1);
        Quote quote3 = new Quote("Keep calm and read on...",2,1);
        Quote quote4 = new Quote("To be or not to be! That is the question!",1,2);
        Quote quote5 = new Quote("quote5",2,2);

        quotes.add(quote1);
        quotes.add(quote2);
        quotes.add(quote3);
        quotes.add(quote4);
        quotes.add(quote5);


        Review review1 = new Review("review1",1,1);
        Review review2 = new Review("review2",2,1);
        Review review3 = new Review("review3",1,2);
        Review review4 = new Review("review4",2,2);

        Mark mark1 = new Mark(5,1,1);
        Mark mark2 = new Mark(7,2,1);
        Mark mark3 = new Mark(8,1,2);
        Mark mark4 = new Mark(10,2,2);

        MyShelf myShelf1 = new MyShelf(1);
        MyShelf myShelf2 = new MyShelf(2);

        MyBook myBook1 = new MyBook(StatusOfBook.IN_PROGRESS,1,1);
        MyBook myBook2 = new MyBook(StatusOfBook.NOT_READ,2,1);

        MyBook myBook3 = new MyBook(StatusOfBook.NOT_READ,2,2);


        myShelf1.addBook(myBook1, myBook2);

        myShelf2.addBook(myBook3);

        List<MyBook> mb = myShelf1.getMyBooks();


        System.out.println(myShelf1);

       // Collections.sort(quotes,new OrderedComparator());
       // Utils.printList(quotes);

        Collections.sort(books, BookComparator.BOOKID);
        Utils.printBookList(books);

        //Collections.sort(books, new OrderedComparator(BookComparator.BOOKID));







    }
}
