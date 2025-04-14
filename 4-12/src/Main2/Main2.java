package Main2;

public class Main2 {
    public static void main(String[] args) {
        Monster monster1 = new Monster("スライム", 5);
        Monster monster2 = new Monster("スライム", 5);
        Monster monster3 = new Monster("スライム", 10);

        if(monster1.equals(monster2)){
            System.out.println(monster1.toString() + "と" + monster2.toString() + "は同じモンスターです");
        } else{
            System.out.println(monster1.toString() + "と" + monster2.toString() + "は違うモンスターです");
        }
        if(monster1.equals(monster3)){
            System.out.println(monster1.toString() + "と" + monster3.toString() + "は同じモンスターです");
        } else{
            System.out.println(monster1.toString() + "と" + monster3.toString() + "は違うモンスターです");
        }
    }
}
