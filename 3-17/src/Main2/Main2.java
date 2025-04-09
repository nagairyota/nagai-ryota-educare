package Main2;

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("田中太郎");
        s1.setScore(85);
        System.out.println(s1.getName() + "さんの点数：" + s1.getScore() + "点");

        Student s2 = new Student();
        s2.setName("あいうえおかきくけこさしすせそたちつてとな");
        s2.setScore(101);
    }
}
