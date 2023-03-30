package Utils.Streams;

public class Book {

    private String name;
    private Author author;
    private String isbn;
    private Long pagesNumber;

    public Book(String name, Author author, String isbn, Long pagesNumber) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.pagesNumber = pagesNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(Long pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
