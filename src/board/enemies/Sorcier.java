package board.enemies;

import board.mainBoard.Fighting;

public class Sorcier extends Enemy implements Fighting{
    public Sorcier() {
        super("Sorcier",
                9,
                2);
    }

    @Override
    public void fight(int life, int attack) {
        Fighting.super.fight(life, attack);
    }


    @Override
    public String toString() {
        return "un sorcier";
    }
}
