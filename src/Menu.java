import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

public class Menu {

    private Personnage personnage;
    private Scanner scanner = new Scanner(System.in);

    private int type = 0;

    public void createCharacter() {
        while (type != 1 && type != 2) {
            System.out.println("choisir votre personnage \n 1 = guerrier \n 2 = magicien");
            type = this.scanner.nextInt();
            this.scanner.nextLine();
            if (type == 1) {
                this.personnage = new Personnage("warrior");
            } else {
                this.personnage = new Personnage("magician");
            }
        }
    }

    public void displayCharacter() {
        System.out.println(this.personnage);
    }


    public void setCharacter() {
        Scanner newName = new Scanner(System.in);
        System.out.println("Entrer un nom pour votre personnage");
        String name = newName.nextLine();
        this.personnage.setName(name);
    }


    public void exitProgram() {
        String value = scanner.nextLine();
        if (value == "exit") {
            System.exit(0);
        }
    }

    public void startGame extends java.awt.event.() {
        System.out.println("Appuyer sur S pour commencer la partie");
        String value = scanner.nextLine();
        if (value == "S") {
            System.exit(0);
        }
    }
}
