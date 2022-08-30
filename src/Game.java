import characters.Player;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private final Scanner scanner = new Scanner(System.in);
    // Attributs
//    Character character;
    private int position;
    private boolean isOver = false;

    private Player player;

    private Menu menu; // ????????? faut-il instancier
    public GameState state = GameState.START;

    // --------------------
    // Constructeur
    public Game() {

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


    public void playGame(){
        Player player = null;
        boolean goOn = true;
        while (goOn) {
            switch (this.state) {
                case START:
                    player = this.startGame();
                    break;
                case PLAY:
                    this.initGame();
                    break;
                case KILLED:
                    this.playerKilled(player.getLife());
                    break;
                case VICTORY:
                    goOn = endGame();
            }
        }
    }

    public void playerKilled(int life) {
        if (life <= 0) {
            System.out.println("you have been kicked of this existence, replay [N] or exit [E]");
            String userInput = scanner.nextLine();
            if (userInput.equals("N")) {
                initGame();
            } else if (userInput.equals("E")) {
                System.exit(0);
            }

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
        Player player = menu.createCharacter();
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
        int dice = random.nextInt(2) + 18;
        System.out.println("valeur du dé " + dice);
        return dice;
    }


}


//function reset