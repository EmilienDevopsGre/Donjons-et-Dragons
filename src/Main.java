import javax.swing.text.Position;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Personnage personnage = menu.createCharacter();
        menu.displayCharacter(personnage);
        menu.setCharacter(personnage);
        menu.displayCharacter(personnage);
        Game game = new Game(personnage);
        game.playGame();
    }
}
