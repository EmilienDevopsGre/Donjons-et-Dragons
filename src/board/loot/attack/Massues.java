package board.loot.attack;

public class Massues extends Weapon{
    public Massues() {
        super("weapon", 3, "massue");
    }

    @Override
    public String toString() {
        return "Massues{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
