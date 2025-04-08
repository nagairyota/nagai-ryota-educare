package Main6;

public class Main6 {
    public static void main(String[] args) {
        Account a1 = new Account(12345);
        System.err.println("口座番号：" + a1.accountNumber);
        a1.deposit(1000);
        a1.withdraw(500);
    }
}
