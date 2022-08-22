import java.util.Scanner;

public class Menu {
    public void createCharacter(){
        Scanner scanner = new Scanner(System.in);
        int type = 0;
        while (type != 1  && type !=2) {
            System.out.println("choisir votre personnage \n 1 = guerrier \n 2 = magicien");

            type = scanner.nextInt();

            System.out.println(type);
        }
        Personnage warrior = new Personnage("warrior");
        System.out.println(warrior);
        Personnage magician = new Personnage("magician");
        System.out.println(magician);

        scanner.nextLine();
    }

}
