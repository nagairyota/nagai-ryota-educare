
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {
         // 商品名と在庫数を管理するHashMapを作成
        Map<String,Integer> item = new HashMap<>();
        // 商品を入荷（在庫を追加）
        item.put("おにぎり", 15);
        item.put("サンドイッチ", 8);
        item.put("お弁当", 5);
        // 現在の在庫状況を表示
        System.out.print("在庫状況: {");
        for(Map.Entry<String, Integer> entry : item.entrySet()){
            String items = entry.getKey();
            int number = entry.getValue();
            System.out.print(items + "=" + number + " ");
        }
        System.out.println("}");
        // おにぎりを1個販売
        if(item.containsKey("おにぎり")){
            int stockO = item.get("おにぎり");
            if(stockO > 0){
                System.out.println("おにぎりを１個販売しました");
                item.put("おにぎり", stockO - 1);
            }
        }
        // 更新後の在庫状況を表示
        System.out.print("在庫状況: {");
        for(Map.Entry<String, Integer> entry : item.entrySet()){
            String items = entry.getKey();
            int number = entry.getValue();
            System.out.print(items + "=" + number + " ");
        }
        System.out.println("}");
        // アイスクリームの在庫確認
        System.out.println("アイスクリームは在庫がありますか？: " + item.containsKey("アイスクリーム"));
    }
}
