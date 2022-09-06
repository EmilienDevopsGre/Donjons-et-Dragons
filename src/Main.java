import board.mainBoard.Board;
import mainStuff.Game;
import mainStuff.Menu;
import mainStuff.OutOfBoardException;
import players.Player;

public class Main {
    public static void main(String[] args) throws OutOfBoardException {



        Menu menu = new Menu();
        Player player = menu.createCharacter();
        Board board = new Board(player);
        board.initBoard();
        board.show();
//        board.getCasesArray();
        Game game = new Game(board);
        game.playGame();
    }
}






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