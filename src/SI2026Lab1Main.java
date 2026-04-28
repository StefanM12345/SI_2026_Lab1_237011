import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private String genre;
    private boolean borrowed;

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean searchBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }



    public void printByGenre(String genre) {
        for (Book b : books) {
            if (b.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(b.getTitle());
            }
        }
    }
}

public class SI2026Lab1Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy"));
        library.addBook(new Book("The Hobbit", "Tolkien", "Fantasy"));
        library.addBook(new Book("Clean Code", "Robert Martin", "Programming"));

        // TEST SEARCH
        System.out.println(library.searchBook("Harry Potter"));

        // TEST BORROW


        // TEST GENRE
        library.printByGenre("Fantasy");
    }
}