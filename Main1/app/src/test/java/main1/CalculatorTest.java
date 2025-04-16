package main1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        // ここにテストコードを書く
        Calculator c = new Calculator();
        int result = c.add(2, 3);
        int result2 = c.add(-1, 5);
        int result3 = c.add(0, 4);
        assertEquals(5, result, "2+3の結果が正しくありません。");
        assertEquals(4, result2,"-1+5の結果が正しくありません。");
        assertEquals(4, result3,"0+4の結果が正しくありません。");
    }

    @Test
    void testSubtract() {
        // ここにテストコードを書く
        Calculator c = new Calculator();
        int result = c.subtract(5, 3);
        int result2 = c.subtract(-1, 2);
        int result3 = c.subtract(4, 0);
        assertEquals(2, result, "5-3の結果が正しくありません。");
        assertEquals(-3, result2, "-1-2の結果が正しくありません。");
        assertEquals(4, result3, "4-0の結果が正しくありません。");
    }
}