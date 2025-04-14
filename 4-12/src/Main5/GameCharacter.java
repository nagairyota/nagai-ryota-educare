package Main5;

import java.util.Collections;
import java.util.List;

public class GameCharacter {
    String name;
    List<Equipment> equipmentsList;

    public GameCharacter(String name, List<Equipment> equipmentsList){
        this.name = name;
        this.equipmentsList = equipmentsList;
    }

    // 装備追加
    public void addEquipment(Equipment e){
        equipmentsList.add( e);
    }

    // 全装備表示
    public void showEquipment(){
        System.out.println(this.name + "の装備:");
        for (int i = 0; i < this.equipmentsList.size(); i++) {
            System.out.println((i + 1) + "." + this.equipmentsList.get(i));
        }
    }


    // 装備品並び替え（降順）
    public void sortEquipment(){
        Collections.sort(this.equipmentsList);
    }

}


