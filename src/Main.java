import board.enemies.EnemyCase;
import board.enemies.Gobelin;
import board.mainBoard.Board;
import board.mainBoard.Case;
import board.mainBoard.EmptyCase;
import mainStuff.Game;
import mainStuff.OutOfBoardException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws OutOfBoardException {


//        ArrayList<Case> board = new ArrayList<>();
//
//        board.add(new EnemyCase(new Gobelin()));
//        board.add(new EnemyCase(new Gobelin()));
//        board.add(new EnemyCase(new Gobelin()));
//
//        for (Case element: board) {
//            System.out.println(element);
//        }
//
//        System.out.println("---------------------------");
//        board.set(0, new EmptyCase());
//
//
//        board.forEach(System.out::println);
//
//        board.forEach(element -> System.out.println(element));
//
//        for (Case element: board) {
//            System.out.println(element);
//        }
//
//        for (int i = 0; i < board.size(); i++) {
//            System.out.println(i + " " + board.get(i).toString());
//        }

        Board board = new Board();
        board.initBoard();
//        board.getCasesArray();
        Game game = new Game(board);
        game.playGame();
    }
}
