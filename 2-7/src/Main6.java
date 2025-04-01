
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("現在の経験値を入力してください:");
        String pointStr = scan.nextLine();
        int point = Integer.parseInt(pointStr);

        double preBonus = point * 1.25;
        int bonus = (int)preBonus;

        System.out.println("ボーナス後の経験値:" + bonus);
    }
}
