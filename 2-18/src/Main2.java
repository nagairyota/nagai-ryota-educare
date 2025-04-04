public class Main2 {
    public static void main(String[] args) {
        int score = 85;
        System.out.println(value(score));
    }
    public static String value(int score){
        String result = null;
        if(score >= 80){
            result = "優";

        } else if(score >= 70){
            result = "良";
        } else if(score >= 60){
            result = "可";
        } else if(score < 60){
            result = "不可";
        }
        return "成績:" + result;
    }
}
