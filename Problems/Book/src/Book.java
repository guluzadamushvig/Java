import java.util.Arrays;
class Book {
    String title;
    int yearOfPublishing;
    String[] authors = new String[6];

    public Book(String title, int yearOfPublishing, String[] authors) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
        this.authors = authors;
    }
}
