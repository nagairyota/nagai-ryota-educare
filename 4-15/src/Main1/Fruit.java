package Main1;

public class Fruit<N, P> {
    private N name;
    private P price;
    
    public void setData(N name, P price) {
        this.name = name;
        this.price = price;
    }
    
    public void displayInfo() {
        System.out.println("果物: " + name);
        System.out.println("価格: " + price + "円");
    }
}
