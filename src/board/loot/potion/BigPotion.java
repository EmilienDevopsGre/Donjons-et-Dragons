package board.loot.potion;

public class BigPotion extends Potion {
    public BigPotion(){
        super("Big Potion",
                5
        );
    }

    @Override
    public String toString() {
        return "BigPotion{" +
                "lifeInc=" + lifeInc +
                '}';
    }
}
