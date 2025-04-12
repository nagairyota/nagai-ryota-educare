package Main3;

public class ScoreManager {
        public void validateScore(int score) throws GameScoreException{
        if(score < 0){
            throw new InvalidScoreException(score);
        } else if(score > 100){
            throw new ScoreOverflowException(score);
        }
    }
}
