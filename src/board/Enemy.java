package board;

public abstract class Enemy {
    // Attributs
    protected int life;
    protected int attack;

    // Constructeur

    public Enemy(int life, int attack) {
        this.life = life;
        this.attack = attack;

    }
}

