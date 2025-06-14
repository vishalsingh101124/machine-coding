import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int size;
    private  Map<Integer,Integer> snakes;
    private  Map<Integer,Integer> ladder;

    public Board(int size) {
        this.size = size;
        snakes=new HashMap<>();
        ladder=new HashMap<>();
    }

    public void addSnake(int head,int tail){
        snakes.put(head,tail);
    }
    public void addLadder(int start,int end){
        ladder.put(start,end);
    }

    public int getNextPosition(int position,StringBuilder sb){
        if(snakes.containsKey(position)){
            sb.append("snaked bitten, your next position is ").append(snakes.get(position)).append("\n");
            return snakes.get(position);
        }
        if(ladder.containsKey(position)){
            sb.append("You Got a Ladder at ").append(position).append(" your next position is ").append(ladder.get(position)).append("\n");
            return ladder.get(position);
        }
        return  position;
    }

    public int getSize() {
        return size;
    }
}
