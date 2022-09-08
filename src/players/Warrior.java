package players;

import players.attack.OffensiveEquipment;
import players.attack.Weapon;
import players.defense.DefensiveEquipment;
import players.defense.Shield;

public class Warrior extends Player {

    public Warrior(int id, String name, String type, int life, int force, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
        super(id, name, type, life, force, offensiveEquipment, defensiveEquipment);


    }

}
