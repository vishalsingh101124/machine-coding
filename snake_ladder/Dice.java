import java.util.Random;

public class Dice {
    private final int totalFace;
    Random random;

    public Dice(int totalFace) {
        random=new Random();
        this.totalFace = totalFace;
    }

    public int rollDice(){
        return random.nextInt(totalFace)+1;
    }
}
