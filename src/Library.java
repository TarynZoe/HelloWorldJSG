package com.java.example;
import java.util.ArrayList;


public class Library {
    public ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell",9783103900095L, 1949));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public ArrayList<Book> displayLibrary() {
        return books;
    }

}

