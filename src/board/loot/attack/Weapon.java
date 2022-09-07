package board.loot.attack;

public class Weapon extends Offensive {
    public Weapon(String type, int attackLevel, String name) {
        super("weapon", attackLevel, name);
    }

    @Override
    public String toString() {
        return "Weapon";
    }
}


