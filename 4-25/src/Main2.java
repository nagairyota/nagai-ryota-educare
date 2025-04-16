import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        List<String> upperList = words.stream()
        .map(n -> n.toUpperCase())
        .toList();

        System.out.println(upperList);
    }
}
