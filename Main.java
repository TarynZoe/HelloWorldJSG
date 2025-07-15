import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean running = true;
        Library library = new Library();
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
                    Book book = new Book();
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
                    long removeBook = sc.nextLong();
                    break;
                case 3:
                    System.out.println("View Library:");
                    System.out.println(library.displayLibrary());
                    break;
                case 4:
                    System.out.println("Search Library:");
                    System.out.println("Enter Book ISBN:");
                    long search = sc.nextLong();
                    break;
                case 5:
                    System.out.println("Exit? (Y/N)");
                    char exInput= sc.next().charAt(0);
                    if (exInput == 'y' || exInput == 'Y') {
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