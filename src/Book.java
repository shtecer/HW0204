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
}