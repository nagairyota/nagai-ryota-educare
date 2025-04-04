
import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};
        int[] quantities = {1, 2, 3};
        culculate(prices, quantities);
    }
    public static void culculate(int[] prices, int[] quantities){
        int[] results = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            results[i] = (int)Math.round(prices[i] * quantities[i] * 1.08);
            }
            System.out.println("商品価格:" + Arrays.toString(prices) + "数量:" + Arrays.toString(quantities) + "\n合計金額:" + Arrays.toString(results));
        }
    }
