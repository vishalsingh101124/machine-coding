import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayGame {
    public static void main(String[] args) {
        System.out.println("Hello World!!");

        /*
        Take a Bottom Up - Approach to design This Game
        Entities Involved - Lowest To Highest
            - Player
            - Dice
            - Board
            - Game

         */

        Board board = new Board(100);
        board.addSnake(99, 10);
        board.addSnake(90, 20);
        board.addLadder(5, 25);
        board.addLadder(40, 80);

        List<Player> players = Arrays.asList(new Player("Vishal",0), new Player("Kumar",0));

        Game game = new Game(board, players);
        System.out.println( game.playGame());
    }
}
