package main2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class DividerTest {
    @Test
    void testNormalDivision() {
        Divider divider = new Divider();
        // 正の数の除算テスト
        divider.divide(6, 2);
        divider.divide(-8, 2);
        divider.divide(5.0, 2.0);

        assertEquals(3.0, divider.divide(6.0, 2.0), 0.0001, "6 ÷ 2 は 3 になるはず");
        assertEquals(-4.0, divider.divide(-8.0, 2.0),0.0001,"-8 ÷ 2 は- 4 になるはず");
        assertEquals(2.5, divider.divide(5.0, 2.0),0.0001,"-8.0 ÷ 2.0 は -4.0 になるはず");
    }

    @Test
    void testExceptionDivision() {
        Divider divider = new Divider();
        try {
            IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, ()->divider.divide(5.0, 0),"0で割ると例外が出る");
            assertEquals("ゼロで除算はできません", thrown.getMessage(),"例外メッセージが正しくありません");
        } catch (Exception e) {
              fail("想定外の例外が発生しました: " + e);
        }
    }
}