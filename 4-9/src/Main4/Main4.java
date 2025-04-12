package Main4;

import java.util.NoSuchElementException;


public class Main4 {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        try {
            manager.addStudent("アリス");
            manager.addStudent("ボブ");
            manager.addStudent("チャーリー");
            manager.addStudent(null);
            manager.addStudent("イヴ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー：" + e.getMessage());
        }

        // ６人目の登録
        try {
            manager.addStudent("田中");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー：" + e.getMessage());
        }

        // 学生ID２
        try {
            System.out.println("学生ID 2:" + manager.getStudent(2));
        } catch (Exception e) {
            System.out.println("エラー：" + e.getMessage());
        }

        // ３人目の学生表示
        try {
            System.out.println(manager.getStudent(3));
        } catch (NullPointerException e) {
            System.out.println("エラー：" + e.getMessage());
        }

        // 10人目の取得
        try {
            System.out.println(manager.getStudent(10));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("エラー：" + e.getMessage());
        }

        // 0と1を更新
        try {
            manager.updateStudent(0, "永井");
            manager.updateStudent(1, "ボビー");
        } catch (NoSuchElementException e) {
            System.out.println("エラー：" + e.getMessage());
        } finally{
            System.out.println("更新後の学生ID 1: " + manager.getStudent(1));
        }

        // 存在しないIDを更新
        try {
            manager.updateStudent(10, "サム");
        } catch (NoSuchElementException e) {
            System.out.println("エラー：" + e.getMessage());
        }
    }
}
