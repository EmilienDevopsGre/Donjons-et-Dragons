package characters;
import characters.attack.OffensiveEquipment;
import characters.defense.DefensiveEquipment;

public abstract class Character {

    // Attributs
    private String name;
    private String type;
    private int life;
    private int force;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;


    // Constructeur

    public Character() {
    }

    public Character(String name, String type, int life, int force, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
        this.name = name;
        this.type = type;
        this.life = life;
        this.force = force;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }
//
    // Getters Setters

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setForce(int force) {
        this.force = force;
    }





    // toString

    @Override
    public String toString() {
        return "Personnage{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", life=" + life +
                ", force=" + force +
                ", offensiveEquipment=" + offensiveEquipment +
                ", defensiveEquipment=" + defensiveEquipment +
                '}';
    }


}
