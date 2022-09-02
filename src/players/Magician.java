package players;

import players.attack.Spell;
import players.defense.Philtre;

public class Magician extends Player {
    public Magician() {
        super("magician",
                "magician",
                3,
                8,
                new Spell(),
                new Philtre()
        );
    }
}
