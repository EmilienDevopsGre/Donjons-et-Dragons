package characters;

import characters.attack.Spell;
import characters.defense.Potion;

public class Magician extends Character {
    public Magician() {
        super("magician",
                "magician",
                6,
                15,
                new Spell(),
                new Potion()
        );
    }
}
