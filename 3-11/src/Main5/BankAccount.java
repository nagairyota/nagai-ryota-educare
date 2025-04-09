package Main5;

public class BankAccount {
    String name;
    int balance;
    String history = "";

    public BankAccount(String name, int balance){
        this.name = name;
        this.balance = balance;
        history += "口座作成： 初期残高 = " + balance + "円\n";
    }

    public int deposit(int amount){
        this.balance += amount;
        history += "入金：" + amount + "円\n";
        return this.balance;
    }
    public int withdraw(int amount){
        if(this.balance > amount){
            this.balance -= amount;
            history += "出金：" + amount + "円\n";
            return this.balance;
        } else{
            System.out.println((amount - this.balance) + "円の残高不足");
            return this.balance;
        }
    }
    public void getBalance(){
        System.out.println("口座名義人：" + this.name + "\n残高：" + this.balance + "円");
    }
    public void displayAccountInfo(){
        System.out.println("取引履歴：");
        System.out.println(history);
    }
}
