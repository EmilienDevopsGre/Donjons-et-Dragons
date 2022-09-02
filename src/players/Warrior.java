package players;

import players.attack.Weapon;
import players.defense.Shield;

public class Warrior extends Player {
    public Warrior() {
        super("warrior",
                "warrior",
                5,
                5,
                new Weapon(),
                new Shield());
    }

}
