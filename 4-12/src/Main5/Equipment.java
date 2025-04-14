package Main5;

public class Equipment implements Cloneable,Comparable<Equipment> {
    String name;
    int attack;
    int defense;

    public Equipment(String name, int attack, int defense){
        this.name = name;
        this.attack = attack;
        this.defense = defense;
    }

    public int getPower(){
        return this.attack + this.defense;
    }

    // クローン
    public Equipment clone(){
        try {
            return (Equipment)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("コピーの複製に失敗しました。" + e.getMessage());
        }
    }

    // equals
    @Override
    public boolean equals(Object ojt){
        if(ojt == this) return true;
        if(ojt == null) return false;
        if(!(ojt instanceof Equipment)) return false;

        Equipment e = (Equipment)ojt;
        return e.name.equals(this.name) && e.attack == this.attack && e.defense == this.defense;
    }

    // compareTo
    public int compareTo(Equipment o){
        return Integer.compare(o.getPower(), this.getPower());
    }

    // toString
    public String toString(){
        return this.name + " " + "(" + "攻撃力:" + this.attack + "防御力:" + this.defense + ")";
        }
}
