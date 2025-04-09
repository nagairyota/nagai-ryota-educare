package Main2;

public class Student {
    private String name;
    private int score;

    // getter,setter
    public String getName(){return this.name;}
    public int getScore(){return this.score;}
    public void setName(String name){
        if(name != null && name.length() >= 1 && name.length() <= 20){
            this.name = name;
        }else if(this.name == null){
            System.out.println("名前は1-20文字で設定してください");
        }
    }
    public void setScore(int score){
        if(score < 0 || score > 100){
            System.out.println("点数は0-100の範囲で設定してください");
        }else{
            this.score = score;
        }
    }
}
