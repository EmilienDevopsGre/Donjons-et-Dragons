package board;

public class Spell extends Offensive{
    public Spell(String type, int attackLevel, String name) {
        super("spell", 0, null);
    }

    @Override
    public String toString() {
        return "Spell{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}

