package assignment.exercise;

class Library {
    private String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
    }

    void issueBook(String issue) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].equals(issue)) {
                System.out.println(issue + "book is issued");
                books[i] = null;
                return;
            }
            // else{
            // System.out.println("this book doesnot exist");
            // break;
            // }

        }
        System.out.println("this book doesnot exist");
    }

    void returnBook(String Return) {
        System.out.println("thank you ");
        this.books[this.no_of_books] = Return;
        this.no_of_books++;
        // addBook(Return);
    }

    void showAvailableBooks() {
        System.out.println("Available books are");
        for (String string : this.books) {
            if (string != null) {
                System.out.println(string + "books");
            }
        }
    }

}

public class OnlineLibrary {
    public static void main(String[] args) {
        // Library l1 = new Library();
        Library l1 = new Library();
        l1.addBook("Java");
        l1.addBook("Python");
        l1.showAvailableBooks();
        l1.issueBook("Java");
        l1.showAvailableBooks();
        l1.returnBook("Java");
        l1.showAvailableBooks();
    }
}
