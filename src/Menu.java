import java.util.Scanner;
import java.util.Random;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    private String type = "";

    public Personnage createCharacter() {
        while ( !type.equals("warrior") && !type.equals("magician") ) {
            System.out.println("choisir votre personnage \n warrior \n magician");
            type = this.scanner.nextLine();
        }

        return new Personnage(type);
    }

    public void displayCharacter(Personnage personnage) {
        System.out.println(personnage);
    }


    public void setCharacter(Personnage personnage) {
        Scanner newName = new Scanner(System.in);
        System.out.println("Entrer un nom pour votre personnage");
        String name = newName.nextLine();
        personnage.setName(name);
    }

    public void exitProgram() {
        String value = scanner.nextLine();
        if (value.equals("exit")) {
            System.exit(0);
        }
    }



}
