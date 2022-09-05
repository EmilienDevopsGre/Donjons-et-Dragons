package board.loot;

import board.loot.attack.Offensive;
import board.loot.potion.Potion;
import board.mainBoard.Case;
import mainStuff.Game;
import players.Player;

import java.util.Scanner;

public class SurpriseCase extends Case {

    protected Loot loot;
    protected Potion potion;
    protected Offensive offensive;

    private final Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();

    // Constructeurs

    public SurpriseCase(Potion potion) {
        this.potion = potion;
    }

    public SurpriseCase(Offensive offensive) {
        this.offensive = offensive;
    }
    public SurpriseCase() {
    }

    // Méthodes

//    public void initLoot(Player player, Game game) {
//        System.out.println("vous apercevez l'objet suivant : " + this.loot.toString() + ", Ramasser [R] ou Continuer votre chemin [L]");
//        if (value.equals("R")) {
//            System.out.println("vous avez choisi de ramasser " + this.loot.toString());
//            if (this.loot.name.equals("Big Potion") || this.loot.name.equals("Standard Potion"){
//                return () -> this.drinkPotion(player, game);
//            }
//        } else if (value.equals("L")) {
//            return () -> System.out.println("je fuis");
//        }
//        return () -> System.out.println("retour qui ne sert à rien");
//    }
//
//    public void drinkPotion(Player player, Game game){
//        System.out.println("vous buvez la potion et gagnez");
//    }
}
