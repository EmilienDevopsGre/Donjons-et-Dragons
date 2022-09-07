package board.loot.potion;

public class StandardPotion extends Potion{
    public StandardPotion(){
        super("Standard Potion",
                2
        );
    }

    @Override
    public String toString() {
        return "StandardPotion";
    }
}
