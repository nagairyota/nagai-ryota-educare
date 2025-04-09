package Main1;

public class Main2 {
    public static void main(String[] args) {
        Book b = new Book("Java入門", "山田太郎", 2500, 0);

        b.displayInfo();
        b.checkStock();
    }
}
