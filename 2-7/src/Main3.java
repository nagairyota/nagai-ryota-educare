public class Main3 {
    public static void main(String[] args) {
        int myAttack = 15;
        int enemyDefence = 5;

        // 小数点以下切り捨てで表示される
        int damage = (myAttack *2 - enemyDefence) / 3;

        System.out.println("与えるダメージ" + damage);
    }
}
