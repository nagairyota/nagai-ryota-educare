package Main3;
public class Main3 {
    public static void main(String[] args) {
        Product p1 = new Product("りんご", 100);
        System.out.println("商品名：" + p1.getName() + "\n在庫数：" + p1.getStock());

        p1.removeStock(50);
        p1.addStock(10);
        p1.removeStock(100);
    }
}