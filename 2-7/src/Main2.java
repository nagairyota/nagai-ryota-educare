public class Main2 {
    public static void main(String[] args) {
        int fixedPrice = 2500;
        double preDiscount = fixedPrice * 0.2;
        double preSalesPrice = fixedPrice - preDiscount;

        int discount = (int)preDiscount;
        int salesPrice = (int)preSalesPrice;

        System.out.println("割引額:" + discount + "円" + "\n販売価格:" + salesPrice + "円");
    }
}
