public class Main9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        char operator = '+';

        switch(operator){
            case '+':
            System.out.println(num1 + num2);
            break;

            case '/':
            switch(num2){
                case 0:
                System.out.println("エラー: 0で割ることはできません");
                break;
                default:
                System.out.println(num1 / num2);
            }
            switch(num1){
                case 0:
                System.out.println("エラー: 0で割ることはできません");
                break;
                default:
                System.out.println(num1 / num2);
                break;
            }

            case '-':
            System.out.println(num1 - num2);
            break;

            case '*':
            System.out.println(num1 * num2);
            break;

            default:
            System.out.println("無効な演算子です。");
            break;
        }
    }
}
