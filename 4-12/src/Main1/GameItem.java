package Main1;

public class GameItem{
    String name;
    int price;

    public GameItem(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String toString(){
        return "[" + this.name +  "]" + "価格: " + this.price + "G" ;
    }
}