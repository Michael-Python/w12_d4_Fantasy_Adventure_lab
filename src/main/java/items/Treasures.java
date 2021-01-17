package items;

public class Treasures extends ItemType {

    private int defencePoints;

    public Treasures(String name, int defencePoints){
        super(name);
        this.defencePoints = defencePoints;
    }

    public int getDefence() {
        return defencePoints;
    }
}
