import java.util.Scanner;

public class Personnage {

    // Attributs
    private String name;
    private String type;
    private int life;
    private int force;
    private OffensiveEquipment offensiveEquipment;
    private DefensiveEquipment defensiveEquipment;


    // Constructeur
    public Personnage(String type) {
        if (type.equals("warrior")) {
            this.name = "warrior";
            this.type = "warrior";
            this.life = 10;
            this.force = 10;
            this.offensiveEquipment = new OffensiveEquipment("weapon", "épée");
            this.defensiveEquipment = new DefensiveEquipment("shield", "bouclier");
        }
        else {
            this.name = "magician";
            this.type = "magician";
            this.life = 6;
            this.force = 15;
            this.offensiveEquipment = new OffensiveEquipment("spell", "sort");
            this.defensiveEquipment = new DefensiveEquipment("potion", "philtre");
        }
    }
    // Getters Setters

    public void setName(String name){
        this.name = name;
    }





    /*

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public DefensiveEquipment getDefensiveEquipment() {
        return defensiveEquipment;
    }

    public void setDefensiveEquipment(DefensiveEquipment defensiveEquipment) {
        this.defensiveEquipment = defensiveEquipment;
    }
*/
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
