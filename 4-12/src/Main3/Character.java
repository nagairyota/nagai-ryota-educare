package Main3;

public class Character implements Comparable<Character>{
    String name;
    int hp;
    int attack;

    public Character(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }

    @Override
    public int compareTo(Character other){
        if(this.getBattlePower() > other.getBattlePower()){
            return -1;
        }
        if(this.getBattlePower() < other.getBattlePower()){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return this.name + "(" + "HP:" + this.hp + "攻撃力:" + this.attack + ")" + "戦闘力: " + this.getBattlePower();
    }

    @Override
    public boolean equals(Object o){
        if(o == this)return true;
        if(o == null)return false;
        if(!(o instanceof Character))return false;
        Character chara = (Character)o;
        return this.getBattlePower() == chara.getBattlePower();
    }

    public int getBattlePower(){
        return this.hp + this.attack;
    }
}

