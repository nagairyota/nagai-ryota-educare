package Main1;

public class Book extends Product {
    String author;
    int stockQuantity;

    public Book(String name,String author, int price,int stockQuantity){
        this.name = name;
        this.price = price;
        this.author = author;
        this.stockQuantity = stockQuantity;
    }

    @Override
    public void displayInfo(){
        System.out.println("書籍名：" + this.name + "\n著者：" + this.author + "\n価格：" + this.price + "円");
    }
    @Override
    public void checkStock(){
        if(this.stockQuantity == 0){
            System.out.println("在庫なし");
        } else if(this.stockQuantity > 0){
            System.out.println("在庫あり");
        }else{
            System.out.println("不正な数値です");
        }
    }
}
