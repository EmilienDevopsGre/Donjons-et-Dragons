package mainStuff;

import board.mainBoard.Board;
import board.mainBoard.InteractionPlayerBoard;
import players.Player;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    // Attributs
    private int position;
    private boolean isOver = false;

    private Player player;

    private Menu menu; // ????????? faut-il instancier
    public GameState state = GameState.START;
    private final Board board;


    // --------------------
    // Constructeur
    public Game(Board board) {

        this.board = board;
    }

    public void nextTurn() throws OutOfBoardException {

        if (this.position < 64) {
            System.out.println("Je joue un tour");
            System.out.println("Entrer R pour lancer le dé et avancer");
            String value = scanner.nextLine();
            if (value.equals("R")) {
                this.position = this.position + diceRoll();
            }
            System.out.println("votre position actuelle " + this.position + "/64");
            InteractionPlayerBoard boardCase = this.board.getCase(position);
            boardCase.startInteraction(player);

        } else {
            this.isOver = true;
            if (this.position > 64) {
                System.out.println("yooooooooooooooooooooooooooooooooooooooooooooo");
                throw (new OutOfBoardException());
            }
        }
    }

    public void initGame() {
        try {
            do {
                this.nextTurn();
            } while (!this.isOver);
            this.endGame();
        } catch (OutOfBoardException e) {
            e.printStackTrace(); // afficher l'exception
            this.state = GameState.VICTORY;
        }
    }


    public void playGame() {
        boolean goOn = true;
        while (goOn) {
            switch (this.state) {
                case START -> player = this.startGame();
                case PLAY -> this.initGame();
                case KILLED -> this.playerKilled();
                case VICTORY -> goOn = endGame();
            }
        }
    }

    public void playerKilled() {
        System.out.println("you have been kicked of this existence, replay [N] or exit [E]");
        String userInput = scanner.nextLine();
        if (userInput.equals("N")) {
            this.state = GameState.START;;
        } else if (userInput.equals("E")) {
            System.exit(0);
        }
    }


    public boolean endGame() {

        System.out.println("you win, you can replay [N] or exit [E]");
        String userInput = scanner.nextLine();

        if (userInput.equals("N")) {
            this.state = GameState.START;
            return true;
        } else if (userInput.equals("E")) {
            return false;
        }
        return false;
    }


    public Player startGame() {
        isOver = false;
        Menu menu = new Menu();
        menu.displayCharacter(player);
        menu.setCharacter(player);
        menu.displayCharacter(player);
        System.out.println("Entrer S pour commencer la partie");
        String value = scanner.nextLine();
        if (value.equals("S")) {
            this.position = 1;
            System.out.println("je suis sur la case " + this.position);
        }
        this.state = GameState.PLAY;
        return player;
    }

    public int diceRoll() {
        Random random = new Random();
        int dice = random.nextInt(2) + 1;
        System.out.println("valeur du dé " + dice);
        return dice;
    }


    public Board getBoard() {
        return board;
    }

    public int getPosition() {
        return position;
    }
}


//function reset