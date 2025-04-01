public class Main4 {
    public static void main(String[] args) {
        double maxHp = 1000.0;
        double tentativeHp = maxHp * 0.837;

        int nowHp = (int)tentativeHp;

        System.out.println("現在HP：" + nowHp);
    }
}
