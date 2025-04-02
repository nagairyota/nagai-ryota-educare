public class Main4 {
    public static void main(String[] args) {
        int[][] seats = new int[5][6];
        seats[0][2] = 1;
        seats[1][1] = 1;
        seats[1][4] = 1;
        seats[3][0] = 1;
        seats[3][5] = 1;
        seats[4][2] = 1;

        int[][] reserve = {
            {3,4},
            {-1,10},
            {3,4},
            {0,0}
        };
        for(int[] seat : reserve){
            int row = seat[0];
            int col = seat[1];

            if(row < 0 || col < 0 || row > seats.length || col > seats.length){
                System.out.println("無効な座席番号です。");
                continue;
            }
            if(seats[row][col] == 0){
                seats[row][col] = 1;
                System.out.println(row + "行" + col + "列の座席を予約しました。");
            } else if(seats[row][col] == 1){
                System.out.println("指定された座席はすでに予約済みです。");
            }
        }

        System.out.println("現在の座席状況:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print("[" + seats[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
}
        // int[][] reserve = new int[5][6];
        // reserve[2][3] = 1;

        // for(int i = 0; i < reserve.length; i++){
        //     int x = reserve[i][0];
        //     int y = reserve[i][1];
        //     if(x == 0 || y == 0){
        //         System.out.println(i + "行" + "4列の座席を予約しました。");
        //         break;
        //     } else if(x == 1 || y == 1){
        //         System.out.println("指定された座席はすでに予約済みです。");
        //         break;
        //     } else if(x < 0 || x > 5 || y < 0 || y > 6){
        //         System.out.println("無効な座席番号です。");
        //     }
        //     System.out.println(reserve[2][3]);
        // }