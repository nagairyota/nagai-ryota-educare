package Main4;

public class Main4 {
    public static void main(String[] args) {
        Book b1 = new Book("Java入門");
        Library l1 = new Library(b1);
        l1.lendBook();
        l1.lendBook();
        l1.returnBook();
        l1.lendBook();
    }
}
