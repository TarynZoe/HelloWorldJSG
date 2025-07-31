package com.java.example;
import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
        books.add(new Book("1984", "George Orwell",9783103900095L, 1949));
        books.add(new Book("Brave New World", "Aldous Huxley", 9780060850524L, 1932));
        books.add(new Book("Tess of the d'Urbervilles", "Thomas Hardy", 9780141439594L, 1891));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(long ISBN) {
        return books.removeIf(book -> book.getISBN() == ISBN);
    }

    public boolean doesBookExist(long ISBN) {
        for (Book book : books) {
            if(book.getISBN() == ISBN){
                return true;
            }
        }
        return false;
    }
    /*public boolean checkISBNlength(long ISBN) {
        for (Book book : books) {
            if()
        }
        }*/
    public String getBookTitlebyIsbn(long ISBN) {
        for (Book book : books) {
            if (book.getISBN() == ISBN) {
                return book.getTitle();
            }
        }
        return null;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }

    }
}

