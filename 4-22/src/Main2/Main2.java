package Main2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main2 {
    public static void main(String[] args) {
        // プロパティファイルのパス
        String filePath = "src\\Main2\\excersise.properties";
        
        // Properties オブジェクトを作成
        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream(filePath)) {
        // ここにコードを書いてください
        properties.load(input);
        System.out.println("username = " + properties.get("username"));
        System.out.println("password = " + properties.get("password"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
