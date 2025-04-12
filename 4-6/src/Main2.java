
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(55);
        scores.add(43);

        // 点数リスト
        System.out.println("点数リスト: " + scores);

        // 平均点
        int total = 0;
        for(Integer score : scores ){
            total += score;
        }
        double avg = (double)total / scores.size();
        System.out.println("平均点: " + avg);

        // 最高点
        int highest = Collections.max(scores);
        System.out.println("最高点: " + highest);

        // 60点以下の不合格者
        ArrayList<Integer> failed = new ArrayList<>();
        for(Integer score :scores){
            if(score <= 60){
                failed.add(score);
            }
        }
        System.out.println("不合格者数: " + failed.size());
    }
}
