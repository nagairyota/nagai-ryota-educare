
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("攻撃力を入力してください：");
        String attackStr = scan.nextLine();
        int attack = Integer.parseInt(attackStr);

        System.out.print("防御力を入力してください：");
        String defenceStr = scan.nextLine();
        int defense = Integer.parseInt(defenceStr);

        int damage = attack - defense;
        System.out.println("通常ダメージ：" + damage);

        double critical = damage * 1.5;
        System.out.println("クリティカルダメージ：" + (int)critical);
    }
}
