package QuizeApp.register;

import java.util.ArrayList;
import java.util.Scanner;

public class WordRegister{
    public static String[] saveToWords(ArrayList<String> enList, ArrayList<String> jpList){
        Scanner scan = new Scanner(System.in);
        // 英語・日本語格納リスト
        ArrayList<String[]> ar = new ArrayList<>();
            while(true){
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
                    } else{
                        System.out.println("全角で入力してください。");
                    }
                }
                System.out.println();
                // 英語リストと日本語訳リストを1つのリストに格納
                enList.add(row);
                jpList.add(col);

                String[] pair = new String[2];
                pair[0] = row;
                pair[1] = col;
                System.out.println();
                return pair;
            }
    }
        //入力規制・半角
        public static boolean  toHalfWidth(String str){
            return str.matches("^[a-zA-z]+$");
        }
        // 入力規制・全角
        public static boolean toFullWidth(String str){
            return str.matches("^[\\p{InHiragana}\\p{InKatakana}]+$");
        }
        // "^[^\\x00-\\x7F]*$"
        // "^[^\\x01-\\x7E\\xA1-\\xDF]+$"
        // "^[^\\x00-\\x7F]+$"
        // "^[\\p{InHiragana}\\p{InKatakana}]+$"
}
