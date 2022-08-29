package board;

public abstract class Potion extends Case{
    protected int lifeInc;

    public Potion(int lifeInc) {
        this.lifeInc = lifeInc;
    }
}
