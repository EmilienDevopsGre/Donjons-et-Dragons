package board;

import players.Player;

public abstract class Case {
    public Case(){

        }
    public InteractionPlayerBoard initInteract(Player player){
        return () ->  System.out.println("je fais rien" + player.getName());
    }
}

