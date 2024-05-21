public class PongScore {
    private int score;
    public PongScore() {
    }
    public int getScore(){
        return score;
    }
    public void scorePoints(int amount){
        score = amount + score;
    }
}
