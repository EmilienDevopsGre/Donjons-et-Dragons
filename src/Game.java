import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);
    // Attributs
    Personnage personnage;
    int position;
    boolean isOver = false;


    // --------------------
    // Constructeur
    public Game(Personnage personnage) {
        this.personnage = personnage;
    }

    public void nextTurn() {
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
        }

    }

    public void playGame() {

        this.startGame();
        do {
            this.nextTurn();
        } while (!this.isOver);
        this.endGame();
    }

    public void endGame() {
        System.out.println("you win, you can replay [N] or exit [E]");
        String userInput = scanner.nextLine();
        if (userInput.equals("N")) {
            playGame();
        } else if (userInput.equals("E")) {
            System.exit(0);
        }
    }

    public void startGame() {
        isOver = false;
        System.out.println("Entrer S pour commencer la partie");
        String value = scanner.nextLine();
        if (value.equals("S")) {
            this.position = 1;
            System.out.println("je suis sur la case " + this.position);
        }
    }

    public int diceRoll() {
        Random random = new Random();
        int dice = random.nextInt(2) + 18;
        System.out.println("valeur du dé " + dice);
        return dice;
    }
}

//function reset