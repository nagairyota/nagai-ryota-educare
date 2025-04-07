
import QuizeApp.quiz.WordQuiz;
import QuizeApp.register.WordRegister;
import java.util.ArrayList;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String[]> wordList = new ArrayList<>();
        ArrayList<String> enList = new ArrayList<>();
        ArrayList<String> jpList = new ArrayList<>();
        int count = 0;
        final int MAX_REGISTER = 20;

        while(true){
            System.out.println("以下の選択肢を表示します：");
            System.out.println("1: 単語を登録する\n" + "2: クイズを受ける\n" + "3: 終了する");
            String input = scan.nextLine();

            if(!input.matches("^[1-3]$")){
                System.out.println("1-3の数字を入力してください");
                continue;
            }

            int num = Integer.parseInt(input);
            
            switch(num){
                case 1:
                if(count >= MAX_REGISTER){
                    System.out.println("登録回数上限に達しました。");
                    break;
                }
                String[] wordPair = WordRegister.saveToWords(enList, jpList);
                if(wordPair != null){
                    wordList.add(wordPair);
                    count++;
                    System.out.println("カウント：" + count);
                    break;
                }
                break;
                
                case 2:
                if(wordList.isEmpty()){
                    System.out.println("単語が登録されていません");
                    break;
                }
                WordQuiz wr = new WordQuiz();
                wr.work(wordList);
                break;

                case  3:
                System.out.println("終了します。");
                System.exit(0);
                break;
            }
        }
    }
}
