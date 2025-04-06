
import QuizeApp.quiz.WordQuiz;
import QuizeApp.register.WordRegister;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String[]> wordList = null;
        while(true){
            System.out.println("以下の選択肢を表示します：");
            System.out.println("1: 単語を登録する\n" + "2: クイズを受ける\n" + "3: 終了する");
            int num = scan.nextInt();
            if(num < 0 || num > 3){
                System.out.println("無効な入力です。");
                break;
            }
            switch(num){
                case 1:
                wordList = WordRegister.saveToWords();
                break;
                
                case 2:
                if(wordList != null && !wordList.isEmpty()){
                    WordQuiz.work(wordList);
                } else{
                    break;
                }
                break;

                case  3:
                System.out.println("終了します。");
                System.exit(0);
                break;
            }
        }
    }
}