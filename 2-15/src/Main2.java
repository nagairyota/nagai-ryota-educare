public class Main2 {
    public static void main(String[] args) {
        int sales[] = {1000, 2000, 1500, 1800, 2200};
        int totalSales = 0;

        for(int sale : sales){
            totalSales += sale;
        }
        System.out.println(totalSales);
    }
}
