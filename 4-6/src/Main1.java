import java.util.ArrayList;

public class Main1{
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("田中");
        student.add("佐藤");
        student.add("鈴木");

        // 学生リスト
        System.out.print("学生リスト：[");
        for(int i = 0; i < student.size(); i++){
            System.out.print(student.get(i));
            if(i != student.size()-1){
                System.out.print(",");
            }
        }
        System.out.println("]");

        // 2番目の学生
        String student2 = student.get(1);
        System.out.println("２番目の学生： " + student2);

        // 学生リストに鈴木さんが含まれているどうか
        System.out.println("鈴木さんは含まれていますか？： " + student.contains("鈴木"));
    }
}