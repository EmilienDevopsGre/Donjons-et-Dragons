package board.loot.attack;

public class BoulesDeFeu extends Spell {
    public BoulesDeFeu() { super("spell", 7, "boule de feu");
    }

    @Override
    public String toString() {
        return "BoulesDeFeu{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}