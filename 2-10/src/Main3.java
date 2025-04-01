public class Main3 {
    public static void main(String[] args) {
        int month = 4;

        if(month < 1 && 12 < month){
            System.out.println("");
        } else if (3 <= month && month <= 5) {
            System.out.println("春");
        } else if(6 <= month && month <= 8){
            System.out.println("夏");
        } else if(9 <= month && month <= 11){
            System.out.println("秋");
        } else if(12 <= month && month <= 2){
            System.out.println("冬");
        }
    }
}
