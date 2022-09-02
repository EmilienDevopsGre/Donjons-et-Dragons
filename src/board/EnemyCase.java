package board;

import mainStuff.Game;
import players.Player;

import java.util.Scanner;


public class EnemyCase extends Case{
    private final Enemy enemy;
    private final Scanner scanner = new Scanner(System.in);


    public EnemyCase(Enemy enemy) {

        this.enemy = enemy;
    }

    @Override
    public InteractionPlayerBoard initInteract(Player player, Game game) {

        System.out.println("vous rencontrez" + this.enemy.toString() + "combattez [F] ou fuyez [L]");
        String value = scanner.nextLine();
        if (value.equals("F")) {
//
            System.out.println("lancement du combat");
            return () ->  this.fight(player, game);
        } else if (value.equals("L")) {
            return () -> System.out.println("je fuis");
        }
        return () -> System.out.println("retour qui ne sert à rien");
    }

    public void fight(Player player, Game game){

//        return () ->  System.out.println("combat entre" + player.getName() + " et " + this.enemy);
            System.out.println("combat entre" + player.getName() + " et " + this.enemy.toString());
            this.enemy.life = this.enemy.life - player.getForce();
            if (this.enemy.life > 0){
            player.setLife(player.getLife() - this.enemy.attack);
            }
            else{System.out.println("vous avez vaincu l'ennemi");}
            if (player.getLife() <= 0) {
                game.playerKilled();
            }
        System.out.println("vie du joueur " + player.getLife() + " vie du monstre" + this.enemy.life);
        System.out.println("dégâts par le joueur " + player.getForce() + " dégâts par le monstre" + this.enemy.attack);
            if(player.getLife()>0 && this.enemy.life > 0){
                fight(player, game);
            }
    }

}

