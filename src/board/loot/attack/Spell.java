package board.loot.attack;

public class Spell extends Offensive {
    public Spell(String type, int attackLevel, String name) {
        super("spell", attackLevel, name);
    }

    @Override
    public String toString() {
        return "Spell";
    }
}

