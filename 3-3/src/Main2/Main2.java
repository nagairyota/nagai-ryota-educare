package Main2;
public class Main2 {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("「Java入門」");
        System.out.println(b.getTitle() + "を登録しました。");
        b.lend();
        b.lend();
        b.returnBook();
        b.lend();
    }
}
