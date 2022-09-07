package board.enemies;

/**
 * @author emilienmace
 * classe abstraite Enemy dont héritent trois classes enfant
 */
public abstract class Enemy {
    /**
     * attribut de type String
     */
    // Attributs
    protected String name;
    /**
     * attribut de type int
     */
    protected int life;
    /**
     * attribut de type int
     */
    protected int attack;

    // Constructeur

    /**
     *  constructeur de la classe Enemy avec 3 paramètres
     *  et initialisation des 3 attributs de la classe
     * @param name
     * @param life
     * @param attack
     */
    public Enemy(String name, int life, int attack) {

        this.name = name;
        this.life = life;
        this.attack = attack;

    }

    /**
     * @return toString des trois attributs de la classe
     */
    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", attack=" + attack +
                '}';
    }
}

