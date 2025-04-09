package Main1;
public class BankAccount{
    private int balance;

    public BankAccount(int  balance){
        this.balance = balance;
    }
    public void deposit(int amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println(amount + "円入金しました");
        } else {
            System.out.println("不正な数字です");
        }
    }
    public void withDraw(int amount){
        if(this.balance >= amount){
            this.balance -= amount;
            System.out.println(amount + "円引き出しました");
        } else if(amount < 0){
            System.out.println("不正な数字です");
        } else{
            System.out.println("引き出しに失敗しました。残高が不足しています。");
        }
    }
    // getter
    public int getBalance(){return this.balance;}
    
}