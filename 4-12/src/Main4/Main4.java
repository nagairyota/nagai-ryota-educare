package Main4;

import java.util.ArrayList;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> skill = new ArrayList<>();
        PartyMember member1 = new PartyMember("アリス", skill);
        PartyMember member2 = member1.clone();

        member1.addSkill("ファイア");
        member1.addSkill("ブリザード");
        member1.showSkill();

        member2.addSkill("ファイア");
        member2.addSkill("ブリザード");
        member2.addSkill("サンダー");
        member2.showSkill();
    }
}
