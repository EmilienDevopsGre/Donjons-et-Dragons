package board.loot.attack;

import board.loot.Loot;

public class Offensive extends Loot {
    protected String type;
    protected int attackLevel;
    protected String name;

    public Offensive(String type, int attackLevel, String name) {
        super(name);
        this.type = type;
        this.attackLevel = attackLevel;
        this.name = name;
    }

    @Override
    public String toString() {
        return "characters.attack.Offensive{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }

}
