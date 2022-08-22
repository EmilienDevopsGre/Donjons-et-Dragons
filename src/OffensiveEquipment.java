public class OffensiveEquipment {
    private String type;
    private int attackLevel;
    private String name;

    public OffensiveEquipment(String type, String name) {
        if (type == "weapon") {
            this.attackLevel = 5;
        }
        else {
            this.attackLevel = 7;
        }
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "OffensiveEquipment{" +
                "type='" + type + '\'' +
                ", attackLevel=" + attackLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
