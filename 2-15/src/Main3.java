

public class Main3 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        String[] weeks = {"月","火","水","木","金","土","日"};
        double sum = 0;

        for(int i = 0; i < temperatures.length; i++){
            System.out.println(weeks[i] + "曜日:" + temperatures[i] + "度");
        }
        for(int i = 0; i < temperatures.length; i++){
            sum += temperatures[i];
        }
        double avg = sum / temperatures.length;
        System.out.println("平均気温:" + avg + "度");
    }
}
