package Main1;

public class Main1{
    public static void main(String[] args) {
        Fruit<String,String> fruit = new Fruit<>();
        fruit.setData("りんご", "300");
        fruit.displayInfo(); // 実行時エラーにな
    }
}