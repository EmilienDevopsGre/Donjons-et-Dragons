package characters;

import characters.attack.Weapon;
import characters.defense.Shield;

public class Warrior extends Character {
    public Warrior() {
        super("warrior",
                "warrior",
                10,
                10,
                new Weapon(),
                new Shield());
    }

}
