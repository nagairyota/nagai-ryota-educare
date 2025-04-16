
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("exercise.txt");
            int data;
            while((data = fr.read()) != -1){
                System.out.print((char)data);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("ファイルの読み込み中にエラーが発生しました");
        }
    }
}
