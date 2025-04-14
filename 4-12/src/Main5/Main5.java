package Main5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5{
    public static void main(String[] args) {
        ArrayList<Equipment> list = new ArrayList<>();
        GameCharacter gameCharacter1 = new GameCharacter("勇者A", list);
        Equipment legendSword = new Equipment("伝説の剣", 100, 0);
        Equipment holyShield = new Equipment("光の盾", 0, 80);
        Equipment magicShoes = new Equipment("魔法の靴", 10, 20);

        gameCharacter1.addEquipment(holyShield);
        gameCharacter1.addEquipment(legendSword);
        gameCharacter1.addEquipment(magicShoes);
        gameCharacter1.showEquipment();
        System.out.println();

        // 複製テスト
        testClone(legendSword);
        // 比較テスト
        testCompare(legendSword, holyShield);
        // ソートの順番テスト
        testSort(list);
    }

    //テスト用メソッド一覧
    private static void testClone(Equipment original) {
        Equipment clone = original.clone();
        if (clone.equals(original)) {
            System.out.println("装備の複製テスト: OK");
        } else {
            System.out.println("装備の複製テスト: 失敗");
        }
    }
    private static void testCompare(Equipment e1, Equipment e2) {
        int result = e1.compareTo(e2);
        if (result < 0) {
            System.out.println("装備の比較テスト: OK");
        } else if (result > 0) {
            System.out.println("装備の比較テスト: 失敗");
        } else {
            System.out.println("同じ強さ");
        }
    }
    private static void testSort(List<Equipment> list) {
        Collections.sort(list);
        boolean isSorted = true;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).getPower() < list.get(i + 1).getPower()) {
                isSorted = false;
                break;
            }
        }
        System.out.println("装備の強さソート: " + (isSorted ? "OK" : "失敗"));
    }
}