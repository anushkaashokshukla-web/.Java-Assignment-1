import java.util.ArrayList;

class Book {
    String title, author, isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        books.removeIf(book -> book.isbn.equals(isbn));
    }

    void displayBooks() {
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "James Gosling", "101"));
        lib.addBook(new Book("Python Guide", "Guido", "102"));

        System.out.println("Books in Library:");
        lib.displayBooks();

        System.out.println("\nAfter removing ISBN 101:");
        lib.removeBook("101");
        lib.displayBooks();
    }
}