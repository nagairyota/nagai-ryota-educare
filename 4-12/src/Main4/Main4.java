package Main4;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> skill = new ArrayList<>();

        // オリジナル
        PartyMember member1 = new PartyMember("アリス", skill);
        member1.addSkill("ファイア");
        member1.addSkill("ブリザード");
        member1.showSkill();

        // コピー
        PartyMember member2 = member1.clone();
        member2.addSkill("サンダー");
        member2.showSkill();
    }
}
