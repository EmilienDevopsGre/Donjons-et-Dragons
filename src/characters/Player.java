package characters;
import characters.attack.OffensiveEquipment;
import characters.defense.DefensiveEquipment;

public abstract class Player {

    // Attributs
    protected String name;
    protected String type;
    protected int life;
    protected int force;
    protected OffensiveEquipment offensiveEquipment;
    protected DefensiveEquipment defensiveEquipment;

    // Constructeur

//    public Character() {
//    }

    public Player(String name, String type, int life, int force, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
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

//    public void setType(String type) {
//        this.type = type;
//    }
//
    public void setLife(int life) {
        this.life = life;
    }

    public int getLife() {
       return this.life;
    }
//
    public void setForce(int force) {
        this.force = force;
    }

    public int getForce() {
        return force;
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
