package com.abunko.leson2.book_books_bookRunner;

import java.util.ArrayList;

/**
 * Created by Andrew on 15.07.2017.
 */
public class Books {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book> booksByAuthor = new ArrayList<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author))
                booksByAuthor.add(book);
        }
        return booksByAuthor;
    }

    public ArrayList<Book> findBooksByPublishingHouse(String publishingHouse) {
        ArrayList<Book> booksByPublisherHouse = new ArrayList<>();

        for (Book book : books) {
            if (book.getPublishingHouse().equals(publishingHouse))
                booksByPublisherHouse.add(book);
        }
        return booksByPublisherHouse;
    }

    public ArrayList<Book> findBooksAfterYear(int year) {
        ArrayList<Book> booksAfterYear = new ArrayList<>();

        for (Book book : books) {
            if (book.getYearOfPublishing() > year)
                booksAfterYear.add(book);
        }
        return booksAfterYear;
    }


}
