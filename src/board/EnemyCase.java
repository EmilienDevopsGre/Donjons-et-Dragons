package board;

import players.Player;

public class EnemyCase extends Case{
    private final Enemy enemy;

    public EnemyCase(Enemy enemy) {

        this.enemy = enemy;
    }

    @Override
    public InteractionPlayerBoard initInteract(Player player){
        return () ->  System.out.println("combat entre" + player.getName() + " et " + this.enemy);
    }
}
