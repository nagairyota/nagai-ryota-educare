package Main5;

public class Main5 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("山田太郎", 10000);

        account.deposit(5000);
        account.withdraw(3000);
        account.getBalance();
        account.displayAccountInfo();
    }
}
