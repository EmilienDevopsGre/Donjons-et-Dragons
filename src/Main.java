import board.Board;

public class Main {
    public static void main(String[] args) throws OutOfBoardException {

        Board board = new Board();
        board.initBoard();
        Game game = new Game(board);
        game.playGame();
    }
}
