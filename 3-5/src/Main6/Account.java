package Main6;

public class Account {
    int accountNumber;
    int balance;
    public Account(int accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    // 入金
    public void deposit(int balance){
        this.balance += balance;
        System.out.println("残高：" + this.balance + "円");
    }
    // 出金
    public void withdraw(int balance){
        this.balance -= balance;
        System.out.println("出金後残高：" + this.balance + "円");
    }
}
