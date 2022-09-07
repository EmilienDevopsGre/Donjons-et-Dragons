package board.enemies;

import board.mainBoard.InteractionPlayerBoard;

/**
 * @author emilienmace
 * La classe Dragon est une classe enfant de la classe abstraite enemy
 */
public class Dragon extends Enemy {
    /**
     * constructeur de la classe Dragon sans paramètres
     */
    public Dragon() {
        super("Dragon",
                15,
                4);
    }


    /**
     * @return toString avec le texte "un dragon"
     */
    @Override
    public String toString() {
        return "un dragon";
    }
}
