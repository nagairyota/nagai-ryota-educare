public class Main1{
    public static void main(String[] args) {
        int price = 1000;
        int quantity = 3;
        culculate(price, quantity);
    }
    public static void culculate(int price, int quantity){
        double sum = price * 1.08 * quantity;
        System.out.println("商品価格: " + price + "円, " + "数量 :" + quantity + "\n合計金額: " + (int)sum + "円");
    }
}
