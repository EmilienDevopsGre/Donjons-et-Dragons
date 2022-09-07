package board.enemies;

/**
 * @author emilienmace
 * La classe Sorcier est une classe enfant de la classe abstraite enemy
 */
public class Sorcier extends Enemy{
    /**
     * constructeur de la classe Sorcier sans paramètres
     */
    public Sorcier() {
        super("Sorcier",
                9,
                2);
    }


    /**
     * @return toString avec le texte "un sorcier"
     */
    @Override
    public String toString() {
        return "un sorcier";
    }
}
