public class Main5 {
    public static void main(String[] args) {
        int note = 280;
        int pencil = 120;
        int eraser = 100;
        int total = note*3 + pencil*5 + eraser*2;

        double preTax = total * 0.1;
        int tax = (int)preTax;

        int change = 2000 - (total + tax);

        System.out.println("小計:" + total + "円" + "\n消費税:" + tax + "円" + "\n合計金額:" +(total + tax) + "円" + "\nおつり:" + change +"円");
    }
}
