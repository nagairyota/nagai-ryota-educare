package Main1;

public class Main1 {
    public static void main(String[] args) {
        BankAccount bc = new BankAccount(1000);

        System.out.println("残高：" + bc.getBalance() + "円");
        bc.deposit(2000);
        System.out.println("残高：" + bc.getBalance() + "円");
        bc.withDraw(1500);
        System.out.println("残高：" + bc.getBalance() + "円");
        bc.withDraw(1501);
    }
}
