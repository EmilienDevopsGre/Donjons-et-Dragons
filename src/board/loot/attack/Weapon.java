package board.loot.attack;

public class Weapon extends Offensive {
    public Weapon(String type, int attackLevel, String name) {
        super("weapon", 0, null);
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}


