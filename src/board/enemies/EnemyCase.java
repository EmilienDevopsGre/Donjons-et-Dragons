package board.enemies;

import board.loot.SurpriseCase;
import board.loot.potion.BigPotion;
import board.loot.potion.StandardPotion;
import board.mainBoard.InteractionPlayerBoard;
import mainStuff.Game;
import players.Player;

import java.util.Scanner;


public class EnemyCase implements InteractionPlayerBoard {
    private final Enemy enemy;
    private final Scanner scanner = new Scanner(System.in);


    public EnemyCase(Enemy enemy) {

        this.enemy = enemy;
    }

    @Override
    public void startInteraction(Player player) {
        System.out.println("vous rencontrez " + this.enemy.toString() + ", combattez [F] ou fuyez [L]");
        String value = scanner.nextLine();
        if (value.equals("F")) {
//
            System.out.println("lancement du combat");
            this.fight(player);
        } else if (value.equals("L")) {
            System.out.println("je fuis");
        }
    }

    public void fight(Player player) {
        do {
//        return () ->  System.out.println("combat entre" + player.getName() + " et " + this.enemy);
        System.out.println("combat entre" + player.getName() + " et " + this.enemy.toString());
        this.enemy.life = this.enemy.life - player.getForce();
        if (this.enemy.life > 0) {
            player.setLife(player.getLife() - this.enemy.attack);
        } else {
            System.out.println("vous avez vaincu l'ennemi");
//            if (this.enemy.name.equals("Gobelin") || this.enemy.name.equals("Sorcier")) {
//                game.getBoard().setCases(new SurpriseCase(new StandardPotion()), game.getPosition());
//                System.out.println("Do you want to take the potion ? [Y] or [N]");
//                if (value.equals("Y")) {
//
//                }
//            } else {
//                game.getBoard().setCases(new SurpriseCase(new BigPotion()), game.getPosition());
//            }

        }
        if (player.getLife() <= 0) {
            System.out.println("vous avez perdu");
//            game.playerKilled();
        }

        System.out.println("vie du joueur : " + player.getLife() + " vie du " + this.enemy.name + " : " + this.enemy.life);
        System.out.println("dégâts par le joueur : " + player.getForce() + " dégâts par le " + this.enemy.name + " : " + this.enemy.attack);
    }
        while (player.getLife() > 0 && this.enemy.life > 0);
    }

    @Override
    public String toString() {
        return enemy.toString();
    }

}

