import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}

class Library {

    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void removeBook(String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                break;
            }
        }
    }

    void displayBooks() {
        for (Book b : books) {
            System.out.println(b.title + " " + b.author + " " + b.isbn);
        }
    }

    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James", "111");
        Book b2 = new Book("Python", "Guido", "222");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayBooks();

        lib.removeBook("111");

        System.out.println("After removing book:");
        lib.displayBooks();
    }
}