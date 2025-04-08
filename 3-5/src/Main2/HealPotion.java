package Main2;

public class HealPotion{
    public void heal(Player p){
        p.hp += 50;
        System.out.println("回復ポーションを使用しました。" + "\nプレイヤーのHP：" + p.hp);
    }
}