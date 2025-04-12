package Main2;

public class Main2 {
    public static void main(String[] args) {
         // テスト用配列の準備
         int[] numbers = {10, 20, 30};
         ArrayAccessor accessor = new ArrayAccessor(numbers);

         // TODO: try-catchで位置5の要素を取得
         try {
            System.out.println("位置１の要素\n" + accessor.getElement(1));
            System.out.println("\n位置5の要素");
            accessor.getElement(5);
         } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
         }
    }
}
