package board.loot.attack;

public class Eclairs extends Spell{
    public Eclairs() {
        super("spell", 2, "éclair");
    }

    @Override
    public String toString() {
        return "Eclairs{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
