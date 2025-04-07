import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int publicationYear;


    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;

    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearOfPublication() {
        return this.publicationYear;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.publicationYear = yearOfPublication;
    }

    @Override
    public String toString() {
        return title + getAuthor() + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, getAuthor(), publicationYear);
    }
}