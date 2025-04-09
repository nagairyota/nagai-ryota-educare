package Main4;

public class Main4 {
    public static void main(String[] args) {
        int yen1 = ExchangeRate.toJPY("USD", 100.0);
        System.out.println("100ドル = " + yen1 + "円");

        ExchangeRate.updateRates(150.0, 160.0);

        int yen2 = ExchangeRate.toJPY("USD", 100.0);
        System.out.println("100ドル = " + yen2 + "円");

        int yen3 = ExchangeRate.toJPY("EUR", 80.0);
        System.out.println("80ユーロ = " + yen3 + "円");
    }
}
