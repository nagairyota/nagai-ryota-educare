public class Main1{
    public static void main(String[] args) {
        String input = "Hello World";
        processString(input);
    }
    public static void processString(String input) {
        System.out.println("入力: \"" + input + "\"\n出力: \"" + input.toUpperCase() + "\"\n入力文字数: " + input.length());
    }
}