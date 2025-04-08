package Main1;
public class Main1 {
    public static void main(String[] args) {
        Weapon sword = new Weapon();
        sword.name = "魔法の剣";
        GameCharacter player = new GameCharacter();
        player.weapon = sword;
        player.name = "剣士アレックス";

        System.out.println(player.name + "は" + player.weapon.name + "を装備しています。");
    }
}
