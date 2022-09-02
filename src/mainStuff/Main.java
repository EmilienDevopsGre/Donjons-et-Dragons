package mainStuff;

import board.Board;

public class Main {
    public static void main(String[] args) throws OutOfBoardException {

        Board board = new Board();
        board.initBoard();
//        board.getCasesArray();
        Game game = new Game(board);
        game.playGame();
    }
}
