package players.attack;

public abstract class OffensiveEquipment {
    protected String type;
    protected int attackLevel;
    protected String name;

    public OffensiveEquipment(String type, int attackLevel, String name) {
        this.type = type;
        this.attackLevel = attackLevel;
        this.name = name;
    }

    @Override
    public String toString() {
        return "characters.attack.OffensiveEquipment{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
