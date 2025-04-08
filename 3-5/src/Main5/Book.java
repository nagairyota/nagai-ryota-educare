package Main5;

public class Book {
    String title;
    String author;
    int pages;
    public Book(String title, String author){
        this(title, author, 0);
    }
    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
}
