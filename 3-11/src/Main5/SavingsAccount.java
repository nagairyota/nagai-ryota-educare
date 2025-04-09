package Main5;

public interface  SavingsAccount {
    // 入金
    int deposit();
    // 出金
    int withdraw();
    // 残高照会
    void getBalance();
    // 口座情報表示
    void displayAccountInfo();
}
