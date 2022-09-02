package board;

public abstract class Enemy {
    // Attributs
    protected String name;
    protected int life;
    protected int attack;

    // Constructeur

    public Enemy(String name, int life, int attack) {

        this.name = name;
        this.life = life;
        this.attack = attack;

    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                '}';
    }
}

