package com.java.example;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        boolean running = true;
        Library library = new Library();
        Book book = new Book();

    while (running) {
        System.out.println("Welcome to The Library App!");
        System.out.println("1 - Add Book");
        System.out.println("2 - Remove Book");
        System.out.println("3 - View Library");
        System.out.println("4 - Search for Book");
        System.out.println("5 - Exit");
        System.out.println("Please select an option number (1-5):");

        Scanner sc = new Scanner(System.in);
        int option = -1;
        try {
            option = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
            sc.nextLine();
            continue;
        }

            switch (option) {
                case 1:
                    System.out.println("Add Book");
                    sc.nextLine();
                    System.out.println("Enter Book Title:");
                    book.setTitle(sc.nextLine());
                    System.out.println("Enter Book Author:");
                    book.setAuthor(sc.nextLine());
                    System.out.println("Enter Book ISBN:");
                    book.setISBN(sc.nextLong());
                    System.out.println("Enter Publishing Year:");
                    book.setYear(sc.nextInt());
                    library.addBook(book);
                    System.out.println("Book Successfully Added!");
                    break;

                case 2:
                    System.out.println("Remove Book - Enter ISBN:");
                    long removeIsbn;
                    try {
                        removeIsbn = sc.nextLong();
                    } catch (InputMismatchException e2) {
                        System.out.println("Invalid ISBN. Please enter a valid ISBN.");
                        sc.next();
                        break;
                    }

                    if (library.doesBookExist(removeIsbn)) {
                        System.out.println("Confirm Removal of " + library.getBookTitlebyIsbn(removeIsbn) + "? (Y/N)");

                        //loop to confirm removal of book
                        char exInput1 = sc.next().charAt(0);
                        if (exInput1 == 'y' || exInput1 == 'Y') {
                            System.out.println("Removing...");
                            System.out.println(library.getBookTitlebyIsbn(removeIsbn) + " has been successfully removed!");
                            library.removeBook(removeIsbn);
                        } else if (exInput1 == 'n' || exInput1 == 'N') {
                            System.out.println("Returning to Main Menu...");

                    } else {
                            System.out.println("Invalid Input. Returning to Main Menu...");
                            break;
                        }
                    } else {
                        System.out.println("Unable to locate book associated with ISBN:" + removeIsbn +". Please check the ISBN and try again.");
                    }
                    break;
                case 3:
                    System.out.println("View Library:");
                    library.printBooks();
                    break;

                case 4:
                    System.out.println("Search Library");
                    System.out.println("Enter Book ISBN:");
                    long libSearch;

                    try {
                        libSearch = sc.nextLong();
                    } catch (InputMismatchException e3) {
                        System.out.println("Invalid ISBN. Please enter a valid ISBN.");
                        sc.next();
                        break;
                    }
                    libSearch = sc.nextLong();
                    boolean bLoc = false;

                    for(Book b : library.getBooks()) {
                        if (b.getISBN() == libSearch) {
                            System.out.println(b.getTitle() + " Located!");
                            bLoc = true;
                            break;
                        }
                    }
                        if(!bLoc){
                            System.out.println("Unable to locate book associated with ISBN:" +libSearch);
                            break;
                    }

                case 5:
                    System.out.println("Exit? (Y/N)");
                    char exInput2= sc.next().charAt(0);
                    if (exInput2 == 'y' || exInput2 == 'Y') {
                        System.out.println("Exiting...");
                        running = false;
                    } else {
                        System.out.println("Returning to Main Menu...");
                        break;
                    }
                    break;

                default:
                    System.out.println("Invalid Selection. Please Try Again.");

            }
        }

    }

}