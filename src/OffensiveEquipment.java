public abstract class OffensiveEquipment {
    private String type;
    private int attackLevel;
    private String name;

//    public abstract OffensiveEquipment(String type, String name) {
//        if (type == "weapon") {
//            this.attackLevel = 5;
//        }
//        else {
//            this.attackLevel = 7;
//        }
//        this.type = type;
//        this.name = name;
//    }


    public OffensiveEquipment(String type, int attackLevel, String name) {
        this.type = type;
        this.attackLevel = attackLevel;
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
