public class Main2 {
    public static void main(String[] args) {
        int score = 75;

        if(score < 0 && 100 < score){
            System.out.println("無効な数字です。");
        } else if(score >= 60){
            System.out.println("合格");
        } else {
            System.out.println("不合格");
        }
    }
}
