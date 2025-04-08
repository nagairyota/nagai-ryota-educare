package Main3;
public class Main3{
    public static void main(String[] args) {
        BankAccount bc1 = new BankAccount();
        bc1.balance = 3000;
        System.out.println("口座１の残高：" + bc1.balance);
        BankAccount bc2;
        bc2 = bc1;
        System.out.println("口座２の残高：" + bc2.balance);
    }
}