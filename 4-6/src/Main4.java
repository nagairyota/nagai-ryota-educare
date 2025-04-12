
import java.util.ArrayList;
import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {
        // 発見したモンスターを管理するHashSet（重複なし）
        HashSet<String> monsterSet = new HashSet<>();
        // 戦闘履歴を管理するArrayList（重複あり）
        ArrayList<String> fightHistory = new ArrayList<>();
        // 全モンスターのリスト
        ArrayList<String> monsterList = new ArrayList<>();
        monsterList.add("スライム");
        monsterList.add("ドラゴン");
        monsterList.add("ゴブリン");
        monsterList.add("フェニックス");
        monsterList.add("ユニコーン");
        // モンスターとの遭遇をシミュレート
        ArrayList<String> encounter = new ArrayList<>();
        encounter.add("スライム");
        encounter.add("スライム");
        encounter.add("スライム");
        encounter.add("スライム");
        encounter.add("スライム");
        encounter.add("ドラゴン");
        encounter.add("ドラゴン");
        encounter.add("ゴブリン");
        encounter.add("ゴブリン");
        for(String monster : encounter){
            monsterSet.add(monster);
            fightHistory.add(monster);
        }
        // 戦闘履歴を記録
        int slimeCounter = 0;
        for(int i = 0; i < encounter.size(); i++){
            if(encounter.get(i).equals("スライム")){
                slimeCounter++;
            }
        }
        // 発見済みモンスターを表示
        System.out.println("発見済みモンスター: " + monsterSet);
        System.out.println("発見済みモンスター数: " + monsterSet.size());
        // スライムとの戦闘回数を計算
        System.out.println("スライムとの戦闘回数: " + slimeCounter);
        // 未発見のモンスターを計算
        ArrayList<String> undiscovered = new ArrayList<>();
        for(String monster : monsterList){
            if(!monsterSet.contains(monster)){
                undiscovered.add(monster);
            }
        }
        System.out.print("未発見モンスター: " +  undiscovered);
    }
}
