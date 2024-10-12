public class Book {

    String bookTitle;
    String bookAuthor;
    String bookISBN;
    boolean isBorrowed;

    static int totalBookCounter;

    static {
        totalBookCounter = 0;
    }

    // Constructor with title, author, and ISBN
    Book(String title, String author, String id) {
        this.bookTitle = title;
        this.bookAuthor = author;
        this.bookISBN = id;
        totalBookCounter++;
    }

    // Constructor with just ISBN (title and author are "Unknown")
    Book(String id) {
        this("Unknown", "Unknown", id);
    }

    // Static method to get total book count
    public static int getTotalBook() {
        return totalBookCounter;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (this.isBorrowed) {
            System.out.println("Book is already borrowed.");
        } else {
            this.isBorrowed = true;
            System.out.println("Enjoy the book!");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (this.isBorrowed) {
            this.isBorrowed = false;
            System.out.println("Thanks, hope you enjoyed the book!");
        } else {
            System.out.println("The book is already present in the library.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create books
        Book computerScience = new Book("CodeScience", "Arham Jamil", "20AbC3");
        Book maths = new Book("20024");

        // Print total book count
        System.out.println("Total books available: " + Book.getTotalBook());

        // Borrow and return books
        computerScience.borrowBook();
        computerScience.borrowBook();  // Should show already borrowed

        maths.borrowBook();
        maths.returnBook();
        maths.returnBook();  // Should show already returned

        computerScience.returnBook();  // Returning the borrowed book
    }
}
