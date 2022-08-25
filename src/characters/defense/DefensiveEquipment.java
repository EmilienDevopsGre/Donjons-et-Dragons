package characters.defense;

public abstract class DefensiveEquipment {
    private String type;
    private int defenseLevel;
    private String name;

    public DefensiveEquipment(String type, int defenseLevel, String name) {
        this.type = type;
        this.defenseLevel = defenseLevel;
        this.name = name;
    }

    //    public characters.defense.DefensiveEquipment(String type, String name) {
//        if (type == "shield") {
//            this.defenseLevel = 3;
//        }
//        else {
//            this.defenseLevel = 4;
//        }
//        this.type = type;
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "characters.defense.DefensiveEquipment{" +
                "type='" + type + '\'' +
                ", defenseLevel=" + defenseLevel +
                ", name='" + name + '\'' +
                '}';
    }
}


