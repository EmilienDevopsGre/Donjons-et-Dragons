package board.enemies;

import board.loot.SurpriseCase;
import board.loot.potion.BigPotion;
import board.loot.potion.StandardPotion;
import board.mainBoard.InteractionPlayerBoard;
import mainStuff.Game;
import players.Player;

import java.util.Scanner;


/**
 * @author emilienmace
 * classe enemyCase qui implémente l'interface InteractionPlayerBoard
 */
public class EnemyCase implements InteractionPlayerBoard {
    /**
     * attribut objet de la classe Enemy
     */
    private final Enemy enemy;
    /**
     * attribut objet de la classe java Scanner
     */
    private final Scanner scanner = new Scanner(System.in);


    /**
     * constructeur de la classe EnemyCase avec un paramètre
     * @param enemy
     */
    public EnemyCase(Enemy enemy) {

        this.enemy = enemy;
    }

    /**
     * méthode issue de l'interface InteractionPlayerBoard avec un paramètre
     * elle permet de décider du lancement du combat ou non
     * @param player
     */
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

    /**
     * méthode fight de type void avec un paramètre
     * elle permet d'exécuter le combat entre le player et l'enemy se trouvant sur la case
     * @param player
     */
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

    /**
     * @return un String de l'objet enemy
     */
    @Override
    public String toString() {
        return enemy.toString();
    }

}

