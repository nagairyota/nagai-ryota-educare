public class Main1{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result = new StringBuilder()
        .append(str1)
        .append(str2)
        .toString();

        String result2 = result.substring(2, 7);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(result);
        System.out.println(result2);
    }
}