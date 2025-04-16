
import java.util.function.Function;

public class Main5 {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplyByTwo = x -> x * 2;
        Function<Integer,Integer> subtractFive = x -> x - 5;
        Function<Integer, Boolean> isPositive = x -> x > 0;

        Function<Integer, Integer> submulti = multiplyByTwo.andThen(subtractFive);
        int number = submulti.apply(8);
        
        boolean isResult = isPositive.apply(number);
        System.out.print(isResult ? "正の数です" : "負の数です");
    }
}
