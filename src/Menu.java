import players.Player;
import players.Magician;
import players.Warrior;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private String type = "";

    public Player createCharacter() {
        while ( !type.equals("warrior") && !type.equals("magician") ) {
            System.out.println("choisir votre personnage \n warrior \n magician");
            type = this.scanner.nextLine();
        }
        if (type.equals("warrior")){
            return new Warrior();
        }
        else {
            return new Magician();
        }
    }

    public void displayCharacter(Player player) {
        System.out.println(player);
    }


    public void setCharacter(Player player) {
        Scanner newName = new Scanner(System.in);
        System.out.println("Entrer un nom pour votre personnage");
        String name = newName.nextLine();
        player.setName(name);
    }

    public void exitProgram() {
        String value = scanner.nextLine();
        if (value.equals("exit")) {
            System.exit(0);
        }
    }



}
