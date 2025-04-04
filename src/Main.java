public class Main {
        public static void main(String[] args) {
                Book book1 = new Book("book1", new Author("firstName1", "lastName1"), 2000);
                Book book2 = new Book("book2", new Author("firstName2", "lastName2"), 2020);

                Author author1 = new Author("firstName1", "lastName1");
                Author aleksandr = new Author("firstName2", "lastName2");
                book2.setYearOfPublication(2010);
        }
}