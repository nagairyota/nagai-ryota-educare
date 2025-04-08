package Main3;

public class Main3 {
    public static void main(String[] args) {
        BankAccount bc = new BankAccount();
        System.out.println("残高：" + bc.getBalance() + "円");
        bc.deposit(10000);
        bc.withdraw(7000);
        bc.withdraw(8000);
    }
}