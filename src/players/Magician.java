package players;

import players.attack.Spell;
import players.defense.Philtre;

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
