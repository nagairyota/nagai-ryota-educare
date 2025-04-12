package Main3;

public class GameScoreException extends Exception {
    String message;
    int score;

    public GameScoreException(String message, int score){
        super(message);
        this.score = score;
    }

    // getter
    public int getScore(){return this.score;}
}
