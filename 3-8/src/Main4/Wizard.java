package Main4;

public class Wizard extends GameCharacter {
    int mp;

    public Wizard(String name, int hp, int mp){
        super(name, hp);
        this.mp = mp;
    }

    public void showStatus(){
        System.out.println("名前：" + this.name + "\nHP：" + this.hp + "\nMP：" + this.mp);
    }
}
