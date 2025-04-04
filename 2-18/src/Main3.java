public class Main3{
    public static void main(String[] args) {
        String input = "Hello";

        StringBuilder sb = new StringBuilder(input);

        String output = sb.reverse().toString();

        System.out.println(output);
    }
}
