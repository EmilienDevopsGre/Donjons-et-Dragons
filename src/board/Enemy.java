package board;

import characters.attack.OffensiveEquipment;
import characters.defense.DefensiveEquipment;

public abstract class Enemy extends Case{
    // Attributs
    protected int life;
    protected int attack;

    // Constructeur

    public Enemy(int life, int attack) {
        this.life = life;
        this.attack = attack;

    }
}

