package Main2;

public class Main2 {
    public static void main(String[] args) {
        HealPotion heal = new HealPotion();
        Player p = new Player();
        p.name = "勇者";
        p.hp = 30;
        p.displayInfo();
        heal.heal(p);
    }
}
