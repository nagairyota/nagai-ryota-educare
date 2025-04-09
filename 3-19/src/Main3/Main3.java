package Main3;

public class Main3 {
    public static void main(String[] args) {
        Library l1 = new Library();

        System.out.println("貸出可能な本: " + l1.getAvailableBooks() + "冊");
        l1.borrowBook(1);
        l1.returnBook(1);
    }
}
