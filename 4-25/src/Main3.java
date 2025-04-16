import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "date", "cherry", "elderberry");
        List<String> filterStrings = words.stream()
        .filter(n -> n.length() >= 5)
        .sorted()
        .collect(Collectors.toList());

        System.out.println(filterStrings);
    }
}
