package Main3;

public class Library {
    static int availableBooks = 100;

    public void borrowBook(int amount){
        if(availableBooks > 0){
            availableBooks -= amount;
            System.out.println(amount + "冊借りました\n" + "貸出可能な本: " + availableBooks + "冊");
        }else{
            System.out.println("貸出可能な本はありません");
        }
    }
    public void returnBook(int amount){
        if(amount <= 0){
            System.out.println("入力された数字に間違いがあります");
        } else if(availableBooks + amount <= 100){
            availableBooks += amount;
            System.out.println("本を返却しました\n" + "貸出可能な本: " + availableBooks + "冊");
        }else{
            System.out.println("返却可能な本の冊数を超えています");
        }
    }

    // getter
    static int getAvailableBooks(){return availableBooks;}
}
