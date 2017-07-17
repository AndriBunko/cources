package com.abunko.leson2.book_books_bookRunner;

/**
 * Created by Andrew on 15.07.2017.
 */
public class BookRunner {

    public static void main(String[] args) {
        Book book = new Book("book", "author", 2000, "house", "binding");
        Book book1 = new Book("book1", "author1", 2001, "house1", "binding1");
        Book book2 = new Book("book3", "author", 2002, "house1", "binding2");
        Books books = new Books();

        books.addBook(book);
        books.addBook(book1);
        books.addBook(book2);

        System.out.println(books.findBooksAfterYear(2000));
        System.out.println(books.findBooksByAuthor("author"));
        System.out.println(books.findBooksByPublishingHouse("house1"));
    }
}
