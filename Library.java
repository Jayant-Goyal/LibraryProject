package LibraryProject;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private List<Book> booksList;
    private Map<String, Book> bookByISBN;

    public Library(){
        booksList = new ArrayList<>();
        bookByISBN = new HashMap<>()
    }

    public void addBook (Book book){
        booksList.add(book);
        bookByISBN.put(book.getIsbn(),book);
        System.out.println("Added to catalog: " + book.getTitle());
    }

    public Book searchByTitle(String title){
        for (Book b : booksList){
            if (b.getTitle().equalsIgnoreCase(title)){
                return b;
            }
        }
        return null;
    }

    public boolean checkoutBook(String isbn){
        Book book = bookByISBN.get(isbn);
        if (book == null){
            System.out.println("No book found with ISBN: " + isbn);
            return false;
        }

        if (book.isCheckedOut()){
            System.out.println("Sorry, the book " + book.getTitle() + " is already checked out.");
            return false;
        }

        book.setCheckedOut(true);
        System.out.println("Success, you checked out: " + book.getTitle());
        return true;
    }

    public void displayAllBooks(){
        System.out.println("\n=== Catalog ===");
        for (Book book : booksList){
            System.out.println(book.toString());
        }
    }
}
