package Main3;

import java.util.ArrayList;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        Character A = new Character("勇者A", 100, 50);
        Character B = new Character("魔法使いB", 70, 70);
        Character C = new Character("戦士C", 80, 40);
        
        list.add(A);
        list.add(B);
        list.add(C);

        // ソート（降順）
        Collections.sort(list);
        for(Character afterSort : list){
            System.out.println(afterSort);
        }

    }
}
