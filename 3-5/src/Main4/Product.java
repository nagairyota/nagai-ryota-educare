package Main4;

public class Product {
    String name;
    int price;
    public Product(){
        this.name = "ノートパソコン";
        this.price = 80000;
    }
    public void displayInfo(){
        System.out.println("商品名：" + this.name + "\n価格：" + this.price + "円");
    }
}
