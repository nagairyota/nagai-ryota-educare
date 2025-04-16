package main3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class RPGCharacterTest {
    @Test
    void testInitialStatus() {
        // ここに初期状態のテストを書く
        RPGCharacter character = new RPGCharacter();

        assertEquals(1, character.getLevel(),"初期状態のレベルではありません");
        assertEquals(100, character.getHP(),"初期状態のHPではありません");
        assertEquals(50, character.getMP(),"初期状態のMPではありません");
    }

    @Test
    void testNormalLevelUp() {
        // ここに通常のレベルアップテストを書く
        RPGCharacter character = new RPGCharacter();
        character.levelUp();
        assertEquals(2, character.getLevel(),"レベルアップ後の数値(Level)が正しくありません");
        assertEquals(110, character.getHP(),"レベルアップ後の数値(HP)が正しくありません");
        assertEquals(55, character.getMP(),"レベルアップ後の数値(MP)が正しくありません");
    }

    @Test
    void testMaxLevel() {
        // ここに境界値のテストを書く
        try {
            RPGCharacter character = new RPGCharacter();
            for (int i = 1; i < 98; i++) {
                character.levelUp();
            }
            character.levelUp();
            int result = character.getLevel();
            assertEquals(99,result,"レベルが違います");
            // 99からのレベルアップした場合の例外発生
            IllegalStateException thrown = assertThrows(IllegalStateException.class, ()->{character.levelUp();},"99からレベルアップすると例外が出る");
            assertEquals("最大レベルに達しています", thrown.getMessage(),"例外メッセージが正しくありません");
        } catch (Exception e) {
            fail("想定外の例外が発生しました: " + e);
        }
    }
}