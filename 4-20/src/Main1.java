
import java.io.FileWriter;
import java.io.IOException;

public class Main1{
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("exercise.txt",true);
            fr.write("Hello,World!");
            fr.flush();
            fr.close();
            System.out.println("ファイルへの書き込みが完了しました。");
        } catch (IOException e) {
            System.out.println("ファイルの書き込み中にエラーが発生しました");
            e.printStackTrace();
        }
    }
}