package players.defense;

public abstract class DefensiveEquipment {
    protected String type;
    protected int defenseLevel;
    protected String name;


    public String getType() {
        return type;
    }

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


