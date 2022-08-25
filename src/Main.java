public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Character character = menu.createCharacter();
        menu.displayCharacter(character);
        menu.setCharacter(character);
        menu.displayCharacter(character);
        Game game = new Game(character);
        game.playGame();
    }
}
