package characters;

import characters.attack.Spell;
import characters.defense.Philtre;

public class Magician extends Player {
    public Magician() {
        super("magician",
                "magician",
                6,
                15,
                new Spell(),
                new Philtre()
        );
    }
}
