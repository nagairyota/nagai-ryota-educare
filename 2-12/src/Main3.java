public class Main3 {
    public static void main(String[] args) {
        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int s = 0; s < height-i; s++) {
                System.out.print(" ");
            }
            for(int a = 0; a < 2*i+1; a++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}