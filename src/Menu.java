import characters.Character;
import characters.Magician;
import characters.Warrior;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private String type = "";

    public Character createCharacter() {
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

    public void displayCharacter(Character character) {
        System.out.println(character);
    }


    public void setCharacter(Character character) {
        Scanner newName = new Scanner(System.in);
        System.out.println("Entrer un nom pour votre personnage");
        String name = newName.nextLine();
        character.setName(name);
    }

    public void exitProgram() {
        String value = scanner.nextLine();
        if (value.equals("exit")) {
            System.exit(0);
        }
    }



}
