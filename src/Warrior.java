public class Warrior extends Character {
    public Warrior() {
        super("warrior",
                "warrior",
                10,
                10,
                new OffensiveEquipment("weapon", "épée"),
                new DefensiveEquipment("shield", "bouclier"));
    }

}
