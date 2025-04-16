
import java.io.File;

public class Main3 {
    public static void main(String[] args) {
        try{
            // フォルダ作成
            File folder = new File("exercise_folder");
            if(folder.exists()){
                System.out.println("フォルダは既に存在します");
            }else if(folder.mkdir()){
                System.out.println("フォルダを作成しました");
            }else{
                System.out.println("フォルダの作成に失敗しました");
            }

            // ファイル作成
            File file = new File("exercise_folder/exercise_file.txt");
            if(file.exists()){
                System.out.println("ファイルは既に存在します");
            }else if(file.createNewFile()){
                System.out.println("ファイルを作成しました");
            }else{
                System.out.println("ファイルの作成に失敗しました");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
