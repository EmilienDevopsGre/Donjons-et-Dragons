package board.enemies;

import board.mainBoard.Fighting;
import mainStuff.Game;
import mainStuff.GameState;
import players.Player;


import java.util.Scanner;

public class Gobelin extends Enemy implements Fighting {




    public Gobelin() {
        super("Gobelin",
                6,
                1);
    }

    @Override
    public void fight(int life, int attack) {
        Fighting.super.fight(life, attack);
    }

    @Override
    public String toString() {
        return "un gobelin";
    }
}















//    public void fight(Player player) {
//        System.out.println("Vous venez de tomber sur un gobelin, que voulez-vous faire ? [attack] [run]");
//        String value = scanner.nextLine();
//
//        if (value.equals("attack")) {
//            do {
//                this.fight(this.life, this.attack); //player attack enemy
//                this.fight(player.getLife(), player.getForce()); //enemy attack player
//            } while (this.life > 0 || player.getLife() > 0);
//            if (player.getLife() < 0) {
//                System.out.println("vous avez perdu la partie");
//            } else if (this.life < 0) {
//
//            }
//        }
//    }



// if (value.equals("attack")) {
//            do {
//                this.life = this.life - player.getForce();
//                int playerLife = player.getLife() - this.attack;
//                player.setLife(playerLife);
//            } while (this.life > 0 || player.getLife() > 0);
//            if (player.getLife() < 0) {
//
//            }
//        }