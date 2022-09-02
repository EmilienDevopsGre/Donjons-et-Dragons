package board;

import mainStuff.Game;
import players.Player;

public abstract class Case {
    public Case(){

        }
    public InteractionPlayerBoard initInteract(Player player, Game game){
        return () ->  System.out.println("je fais rien" + player.getName());
    }


}

