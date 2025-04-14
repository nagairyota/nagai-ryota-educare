package Main2;

public class Monster {
    String name;
    int level;

    public Monster(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public boolean equals(Object object){
        if(object == this)return true;
        if(object == null)return false;
        if(!(object instanceof Monster))return false;
        Monster monster = (Monster)object;
        return this.name.equals(monster.name) && this.level == monster.level;
    }

    public String toString(){
        return this.name + "Lv." + this.level;
    }
}
