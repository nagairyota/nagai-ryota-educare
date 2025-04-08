package Main3;

public class BankAccount {
    // 残高
    int balance;

    public int getBalance(){
        return this.balance;
    }

    public void deposit(int amount){
        this.balance += amount;
        System.out.println(amount +"円預けました。" + "\n残高：" + getBalance() + "円");
    }
    public void withdraw(int amount){
        if(this.balance < amount){
            System.out.println("残高が不足しています。");
        }else {
            this.balance -= amount;
            System.out.println(amount + "円引き出しました。" + "\n残高：" + getBalance() + "円");
        }
    }
}
