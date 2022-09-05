package board.enemies;

import board.mainBoard.Fighting;

public class Dragon extends Enemy implements Fighting {
    public Dragon() {
        super("Dragon",
                15,
                4);
    }

    @Override
    public void fight(int life, int attack) {
        Fighting.super.fight(life, attack);
    }


    @Override
    public String toString() {
        return "un dragon";
    }
}
