// Book.java
class Book {
    String title, author;
    boolean available = true;
    static int issuedCount = 0; // static variable to track issued books

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to borrow book
    void borrowBook() {
        if (available) {
            available = false;
            issuedCount++;
            System.out.println(title + " borrowed.");
        } else {
            System.out.println(title + " not available.");
        }
    }

    // Method to return book
    void returnBook() {
        if (!available) {
            available = true;
            issuedCount--;
            System.out.println(title + " returned.");
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    // Static method to display total issued books
    static void displayIssuedCount() {
        System.out.println("Total books issued: " + issuedCount);
    }
}

// Main class
public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Python Basics", "Guido van Rossum");

        b1.borrowBook();
        b2.borrowBook();
        Book.displayIssuedCount();   // Static method call

        b1.returnBook();
        Book.displayIssuedCount();   // Static method call
    }
}