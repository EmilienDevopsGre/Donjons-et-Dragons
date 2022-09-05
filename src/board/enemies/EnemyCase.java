package board.enemies;

import board.loot.potion.BigPotion;
import board.loot.potion.Potion;
import board.loot.potion.StandardPotion;
import board.mainBoard.Board;
import board.mainBoard.Case;
import board.mainBoard.EmptyCase;
import board.mainBoard.InteractionPlayerBoard;
import mainStuff.Game;
import players.Player;

import java.util.Scanner;


public class EnemyCase extends Case {
    private final Enemy enemy;
    private final Scanner scanner = new Scanner(System.in);
    String value = scanner.nextLine();

    public EnemyCase(Enemy enemy) {

        this.enemy = enemy;
    }

    @Override
    public InteractionPlayerBoard initInteract(Player player, Game game) {

        System.out.println("vous rencontrez " + this.enemy.toString() + ", combattez [F] ou fuyez [L]");
        if (value.equals("F")) {
//
            System.out.println("lancement du combat");
            return () -> this.fight(player, game);
        } else if (value.equals("L")) {
            return () -> System.out.println("je fuis");
        }
        return () -> System.out.println("retour qui ne sert à rien");
    }

    public void fight(Player player, Game game) {

//        return () ->  System.out.println("combat entre" + player.getName() + " et " + this.enemy);
        System.out.println("combat entre" + player.getName() + " et " + this.enemy.toString());
        this.enemy.life = this.enemy.life - player.getForce();
        if (this.enemy.life > 0) {
            player.setLife(player.getLife() - this.enemy.attack);
        } else {
            System.out.println("vous avez vaincu l'ennemi");
//            if (this.enemy.name.equals("Gobelin") || this.enemy.name.equals("Sorcier")) {
//                game.getBoard().setCases(new StandardPotion(), game.getPosition());
//                System.out.println("Do you want to take the potion ? [Y] or [N]");
//                if (value.equals("Y")) {
//
//                }
//            } else {
//                game.getBoard().setCases(new BigPotion(), game.getPosition());
//            }

        }
        if (player.getLife() <= 0) {
            game.playerKilled();
        }
        System.out.println("vie du joueur : " + player.getLife() + " vie du " + this.enemy.name + " : " + this.enemy.life);
        System.out.println("dégâts par le joueur : " + player.getForce() + " dégâts par le " + this.enemy.name + " : " + this.enemy.attack);
        if (player.getLife() > 0 && this.enemy.life > 0) {
            fight(player, game);
        }
    }

    @Override
    public String toString() {
        return enemy.toString();
    }
}

