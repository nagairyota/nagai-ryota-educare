package Main1;
public class Pet{
    String name;
    int energy;

    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public int getEnergy(){return this.energy;}
    public void setEnergy(int energy){this.energy = energy;}

    public void eat(){
        energy += 10;
    }
    public void play(){
        energy -= 20;
    }
    public void showEnergy(){
        System.out.println("現在の体力:" + getEnergy());
    }
}