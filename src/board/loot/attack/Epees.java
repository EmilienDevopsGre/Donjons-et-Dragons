package board.loot.attack;

public class Epees extends Weapon {
    public Epees() {
        super("weapon", 5, "épée");
    }

    @Override
    public String toString() {
        return "Epees{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
