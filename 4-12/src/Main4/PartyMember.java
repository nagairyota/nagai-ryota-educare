package Main4;

import java.util.ArrayList;
import java.util.List;

public class PartyMember implements Cloneable {
    String name;
    List<String> skillList;

    public PartyMember(String name, List<String> skillList){
        this.name = name;
        this.skillList = skillList;
    }

    // スキル追加
    public String addSkill(String skill){
        skillList.add(skill);
        return skillList.toString();
    }

    // 名前・スキル表示
    public void showSkill(){
        System.out.println("「" + this.name + "」のスキル: " + skillList);
    }

    // クローン
    public PartyMember clone(){
        try {
            PartyMember copy = (PartyMember)super.clone();
            copy.skillList = new ArrayList<>(this.skillList);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
