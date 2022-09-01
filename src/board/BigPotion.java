package board;

public class BigPotion extends Potion {
    public BigPotion(){
        super(
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
