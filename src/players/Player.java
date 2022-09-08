package players;
import players.attack.OffensiveEquipment;
import players.defense.DefensiveEquipment;

public abstract class Player {

    // Attributs

    protected String name;
    protected String type;
    protected int life;
    protected int id = 0;
    protected int force;
    protected OffensiveEquipment offensiveEquipment;
    protected DefensiveEquipment defensiveEquipment;

    // Constructeur

//    public Character() {
//    }

    public Player(int id, String name, String type, int life, int force, OffensiveEquipment offensiveEquipment, DefensiveEquipment defensiveEquipment) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.life = life;
        this.force = force;
        this.offensiveEquipment = offensiveEquipment;
        this.defensiveEquipment = defensiveEquipment;
    }

    public Player() {

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

    public String getName() {
        return name;
    }

    public int getForce() {
        return force;
    }

    public String getType() {
        return type;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public int getId() {
        return id;
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
