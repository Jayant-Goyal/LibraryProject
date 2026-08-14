
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a book");
            System.out.println("2. Search a book by title");
            System.out.println("3. Checkout a book (by ISBN)");
            System.out.println("4. View all books");
            System.out.println("5. Exit");

            String choice = sc.nextLine().trim();

            switch(choice){
                case "1":
                    System.out.println("Enter book title:");
                    String title = sc.nextLine();
                    System.out.println("Enter the author:");
                    String author = sc.nextLine();
                    System.out.println("Enter the ISBN:");
                    String isbn = sc.nextLine();

                    library.addBook(new Book(title, author, isbn));
                    break;
                
                case "2":
                    System.out.println("Enter the title of the book you want to find:");
                    String searchTitle = sc.nextLine();
                    Book foundbook = library.searchByTitle(searchTitle);
                    if (foundbook != null){
                        System.out.println("Found: " + foundbook.toString());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case "3":
                    System.out.println("Enter the ISBN of the book you want to checkout:");
                    String checkoutIsbn = sc.nextLine();
                    library.checkoutBook(checkoutIsbn);
                    break;

                case "4":
                    library.displayAllBooks();
                    break;

                case "5":
                    System.out.println("Closing the library. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}
