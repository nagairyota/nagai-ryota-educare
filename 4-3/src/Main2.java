public class Main2 {
    public static void main(String[] args) {
        String message = "これは非常に長いチャットメッセージです。省略する必要があります。";
        System.out.println("原文: " + message);
        System.out.println("省略後(10文字): " + shortenMessage(message, 10));
        System.out.println("省略後(20文字): " + shortenMessage(message, 20));
    }
    public static String shortenMessage(String message, int maxLength) {
        // ここにコードを書いてください
        StringBuilder sb = new StringBuilder();
        sb.append(message.substring(0, maxLength))
        .append("...");
        return sb.toString();
    }
}
