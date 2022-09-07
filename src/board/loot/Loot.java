package board.loot;

public abstract class Loot  {
    protected String name;


    public Loot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Loot{" +
                "name='" + name + '\'' +
                '}';
    }
}

