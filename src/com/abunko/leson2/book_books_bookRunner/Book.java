package com.abunko.leson2.book_books_bookRunner;

/**
 * Created by Andrew on 15.07.2017.
 */
public class Book {
    private static int count = 0;
    private final int id;
    private String name;
    private String author;
    private int yearOfPublishing;
    private String publishingHouse;
    private String binding;

    Book() {
        count++;
        id = count;
    }

    Book(String name, String author, int yearOfPublishing, String publishingHouse, String binding) {
        count++;
        id = count;
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.publishingHouse = publishingHouse;
        this.binding = binding;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", binding='" + binding + '\'' +
                '}';
    }
}
