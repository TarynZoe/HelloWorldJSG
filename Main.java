import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to The Library App!");
        System.out.println("1 - Add Book");
        System.out.println("2 - Remove Book");
        System.out.println("3 - View Library");
        System.out.println("4 - Search for Book");
        System.out.println("5 - Exit");
        System.out.println("Please select an option number (1-5):");

        boolean running = true;
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        while (running) {
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
                    book.setISBN(sc.nextLine());
                    System.out.println("Enter Publishing Year:");
                    book.setYear(sc.nextInt());
                    library.addBook(book);
                    System.out.println("Book Successfully Added!");
                    System.exit(0);
                case 2:
                    System.out.println("Remove Book - Enter ISBN:");
                    String removeBook;
                case 3:
                    System.out.println("View Library:");
                    System.out.println(library.displayLibrary());
                case 4:
                    System.out.println("Search Library:");
                case 5:
                    System.out.println("Exit?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");


                default:
                    System.out.println("Invalid Selection, Please Try Again.");


            }
        }

    }

}