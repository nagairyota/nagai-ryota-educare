public class Main3 {
    public static boolean validateUsername(String username) {
        // ここにコードを書いてください
        if(username.length()>=4 && username.length()<=16 && !username.matches("^[0-9]+$") && username.matches("^[a-zA-z0-9_]+$")){
            return true;
        }
        return false;
    }

    public static boolean validatePassword(String password) {
        if(password.length()>=8 && password.matches(".*[A-Z].*")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // テストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        // ここにテスト用のコードを書いてください
        System.out.println("ユーザー名チェック");
        for(String username : usernames){
            System.out.println(username + "：" + (validateUsername(username) ? "有効" : "無効"));
        }

        System.out.println("パスワードチェック");
        for(String password : passwords){
            System.out.println(password + "：" + (validatePassword(password) ? "有効" : "無効"));
        }
    }
}
