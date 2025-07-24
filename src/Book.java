package com.java.example;

public class Book {
    private  String title = "";
    private  String author = "";
    private  long ISBN = 0;
    private int year = 0;

    public Book() {
        //empty
    };

    public Book(String inTitle, String inAuthor, long inISBN, int inYear)
    {
        title = inTitle;
        author = inAuthor;
        ISBN = inISBN;
        year = inYear;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + ISBN + " | Year Published: " + year;
    }

}
