package Main1;
public class Main1 {
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setName("ポチ");
        pet.setEnergy(100);
        System.out.println("ポチを生み出しました！\n初期体力:" + pet.getEnergy());
        pet.eat();
        System.out.println("ポチは食事をして元気になった！\n現在の体力:" + pet.getEnergy());
        pet.play();
        System.out.println("ポチは遊んで疲れた！");
        pet.showEnergy();
    }
}
