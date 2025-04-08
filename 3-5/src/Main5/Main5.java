package Main5;

public class Main5 {
    public static void main(String[] args) {
        Book b1 = new Book("Java入門","山田太郎");
        System.out.println("本１：" + b1.title + " - " + b1.author + "(" + b1.pages + "ページ)");
        Book b2 = new Book("Python実践", "鈴木太郎", 300);
        System.out.println("本２：" + b2.title + " - " + b2.author + "(" + b2.pages + "ページ)");

    }
}
