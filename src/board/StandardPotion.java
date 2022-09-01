package board;

public class StandardPotion extends Potion{
    public StandardPotion(){
        super(
                2
        );
    }

    @Override
    public String toString() {
        return "StandardPotion{" +
                "lifeInc=" + lifeInc +
                '}';
    }
}
