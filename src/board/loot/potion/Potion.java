package board.loot.potion;

import board.loot.Loot;


public abstract class Potion extends Loot {
    protected String name;
    protected int lifeInc;


    public Potion(String name, int lifeInc) {
        super(name);
        this.lifeInc = lifeInc;
    }
}
