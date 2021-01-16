package items;

public class HealingTools extends ItemType {

    private int pointsToHeal;

    public HealingTools(String name, int pointsToHeal){
        super(name);
        this.pointsToHeal = pointsToHeal;
    }

    public int getHealingPoints() {
        return pointsToHeal;
    }
}
