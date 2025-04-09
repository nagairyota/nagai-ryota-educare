package Main3;

public class Product {
    private String name;
    private int stock;
    public Product(String name, int stock){
        this.name = name;
        this.stock = stock;
    }


    public void addStock(int amount){
        if(amount > 0){
            this.stock += amount;
            System.out.println(amount + "個追加しました" + "\n商品名：" + this.name + "\n在庫数：" + this.stock);
        } else{
            System.out.println("無効な入力です");
        }
    }
    public void removeStock(int amount){
        if(amount > 0 && amount <= this.stock){
            this.stock -= amount;
            System.out.println(amount + "個販売しました" + "\n商品名：" + this.name + "\n在庫数：" + this.stock);
        } else if (this.stock < amount){
            System.out.println("在庫が不足しています");
        } else{
            System.out.println("無効な入力です");
        }
    }

    //getter
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return this.stock;
    }
}
