package players;

import players.attack.OffensiveEquipment;
import players.attack.Spell;
import players.defense.DefensiveEquipment;
import players.defense.Philtre;

public class Magician extends Player {
    public Magician(int id, String name, String type, int life, int force, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
            super(id, name, type, life, force, offensiveEquipment, defensiveEquipment);


    }
}
