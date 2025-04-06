package QuizeApp.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class WordQuiz {
    public static void  work(ArrayList<String[]> wordList){
        Scanner scan = new Scanner(System.in);

        // 正解の数
        int trueCounter = 0;
        // 不正解の数
        int falseCounter =  0;

        // クイズ出題
        int count = 0;
        while(count < wordList.size()){
            String row = wordList.get(count)[0];
            System.out.println(row + "の意味は？");
            String col = wordList.get(count)[1];
            String answer = scan.nextLine();
            if(answer.equals(col)){
                System.out.println("正解です。");
                System.out.println();
                trueCounter++;
            } else{
                System.out.println("不正解です。");
                falseCounter++;
            }
            count++;
        }
        System.out.println("クイズ終了！\n" + (trueCounter + falseCounter) + "問中" + trueCounter + "問正解でした。");
    }
}
