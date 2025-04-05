package QuizeApp.register;

import java.util.ArrayList;
import java.util.Scanner;

public class WordRegister{
    public static ArrayList<String[]> saveToWords(){
        Scanner scan = new Scanner(System.in);
        // 英語・日本語格納リスト
        ArrayList<String[]> ar = new ArrayList<>();
        // 日本語リスト
        ArrayList<String> jp = new ArrayList<>();
        // 英語リスト
        ArrayList<String> en = new ArrayList<>();

        int count = 0;
            // 21回目以降のエラー文出力
            while(count < 25){
                if(count >= 20){
                    System.out.println("21回目の入力をしようとしています。");
                    break;
                }
                // 英単語の保存（半角入力）
                System.out.println("英単語を入力してください：");
                String row;
                while (true) {
                    row = scan.nextLine();
                    if(toHalfWidth(row)){
                        break;
                    } else if((row == null) || !toHalfWidth(row)){
                        System.out.println("全角もしくは文字が入力されていません。再度入力してください。");
                    }
                }
                //日本語訳の保存（全角入力）
                System.out.println("日本語訳を入力してください：");
                String col;
                while (true) {
                    col = scan.nextLine();
                    if(toFullWidth(col)){
                        break;
                    } else if (col == null || !toFullWidth(col)) {
                        System.out.println("全角で入力してください。");
                    }
                }
                System.out.println();
                en.add(row);
                jp.add(col);

                // 英語リストと日本語訳リストを1つのリストに格納
                String[] pair = new String[2];
                pair[0] = en.get(count);
                pair[1] = jp.get(count);
                ar.add(pair);
                count++;
                System.out.println();
            }
            return ar;
    }
        //入力規制・半角
        public static boolean  toHalfWidth(String str){
            return str.matches("^[a-zA-z]+$");
        }
        // 入力規制・全角
        public static boolean toFullWidth(String str){
            return str.matches("^[\\p{IsHiragana} + \\p{IsHan}]");
        }
}
