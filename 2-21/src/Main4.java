
import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        int[] numbers = {5,2,8,1,9};
        processNumbers(numbers);
    }
    public static void processNumbers(int[] numbers) {
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(int num : numbers){
            ar.add(num);
        }
        System.out.println("元のリスト:" + ar);
        Collections.sort(ar);
        System.out.println("ソート後:" + ar);

        int maxNumber = Collections.max(ar);
        int minNumber = Collections.min(ar);
        System.out.println("最大値:" + maxNumber);
        System.out.println("最小値:" + minNumber);
    }
}
