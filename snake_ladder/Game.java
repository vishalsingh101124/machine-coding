import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private final Board board;
    private final Queue<Player> players;
    private  Dice dice;
    private boolean isGameOver;

    public Game(Board board, List<Player> players) {
        this.board = board;
        this.players = new LinkedList<>(players);
        dice=new Dice(6);
        this.isGameOver=false;
    }

    public String playGame(){
        StringBuilder sb=new StringBuilder();
        while (!isGameOver){

            Player currentPlayer=players.poll();
            int rollValue=dice.rollDice();
            assert currentPlayer != null;
            sb.append(currentPlayer.getName()).append(" rolled a dice ").append("with dice value ").append(rollValue).append("\n");
            int nextPosition= currentPlayer.getPosition()+rollValue;
           if(nextPosition> board.getSize()){
               sb.append(currentPlayer.getName()).append(" Can't move. Needs exact number to reach at Final Position").append("/n");

           }else{
               int newPosition = board.getNextPosition(nextPosition,sb);
               currentPlayer.setPosition(newPosition);
               sb.append(currentPlayer.getName()).append(" Moved to ").append(newPosition).append("\n");
           }
           if(currentPlayer.getPosition()==board.getSize()){
               sb.append(currentPlayer.getName()).append(" Won the Game!!").append("\n");
               isGameOver=true;
           }else{
               players.add(currentPlayer);
           }

        }
        return sb.toString();
    }
}
