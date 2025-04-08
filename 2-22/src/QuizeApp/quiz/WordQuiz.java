package QuizeApp.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class WordQuiz {
    public static void work(ArrayList<String[]> wordList) {
        Scanner scan = new Scanner(System.in);

        // 正解の数
        int trueCounter = 0;
        // 不正解の数
        int falseCounter = 0;

        // クイズ出題
        for (int count = 0; count < wordList.size(); count++) {
            String row = wordList.get(count)[0];
            String col = wordList.get(count)[1];
            System.out.println(row + "の意味は？");
            String answer;

            while (true) {
                answer = scan.nextLine();
                // 入力規制（全角）
                if (answer.matches("^[\\p{InHiragana}\\p{InKatakana}\\p{InCJKUnifiedIdeographs}]+$"
)) {
                    break;
                } else {
                    System.out.println("全角もしくは文字が入力されていません。再度入力してください。");
                }
            }

            // 正誤判定
            if (answer.equals(col)) {
                System.out.println("正解です。");
                trueCounter++;
            } else {
                System.out.println("不正解です。");
                falseCounter++;
            }
        }

        // クイズ終了
        System.out.println("クイズ終了！\n" + (trueCounter + falseCounter) + "問中" + trueCounter + "問正解でした。");
    }
}
