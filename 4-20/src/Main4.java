
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main4 {
    public static void main(String[] args) {
        try {
            // フォルダ・ファイル作成
            File archive = new File("archive/");
            File folder = new File("backup/");
            File file = new File("source.txt");

            if(archive.exists()){
                System.out.println("フォルダは既に存在します");
            }else if(archive.mkdir()){
                System.out.println("フォルダを作成しました");
            }else{
                System.out.println("フォルダの作成に失敗しました");
            }
            if(folder.exists()){
                System.out.println("フォルダは既に存在します");
            }else if(folder.mkdir()){
                System.out.println("フォルダを作成しました");
            }else{
                System.out.println("フォルダの作成に失敗しました");
            }
            if(file.exists()){
                System.out.println("ファイルは既に存在します");
            }else if(file.createNewFile()){
                System.out.println("ファイルを作成しました");
            }else{
                System.out.println("ファイルの作成に失敗しました");
            }

            // ファイルとフォルダーのコピー
            Path archive_folder = Paths.get("archive/");
            Path backup = Paths.get("backup/");
            Path source = Paths.get("source.txt");

            // source.txtをbackupにコピー
            Path copiedFile = backup.resolve(source.getFileName());
            try {
                Files.copy(source, copiedFile);
                System.out.println("ファイルが 'backup/' にコピーされました");
                if(Files.exists(copiedFile)){
                    System.out.println("コピーの確認: 成功");
                }
            } catch (IOException e) {
                System.out.println("ファイルコピー時に例外が発生しました");
                e.printStackTrace();
            }

            // source.txtがコピーされたbackup/をarchiveに移動
            Path movedBackup = archive_folder.resolve(backup.getFileName());
            try {
                Files.move(backup, movedBackup);
                System.out.println("ファイルが 'archive/' に移動されました。");
                if(Files.exists(movedBackup)){
                    System.out.println("移動の確認: 成功");
                }
            } catch (IOException e) {
                System.out.println("ファイル移動時に例外が発生しました");
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
